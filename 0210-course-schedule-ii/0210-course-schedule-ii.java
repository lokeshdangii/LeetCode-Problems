class Solution {
    
    public boolean topoSort(int arr[], ArrayList<ArrayList<Integer>> adj, int numCourses){
        int idx = 0;
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();  // this map stores the indegree of node i.e hm <=> indegree
        boolean isCycle = false;


        // Initialize the indegree of each node to 0
        for (int i = 0; i < adj.size(); i++) {
            hm.put(i, 0);
        }

        // storing the indegree of each node in the map 
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                hm.put(adj.get(i).get(j), hm.getOrDefault(adj.get(i).get(j), 0) + 1);
            }  
        }
        // System.out.println(hm);

        // Now push all the node with indegree zero in the queue
        for(int i=0;i<hm.size();i++){
            if(hm.get(i) == 0){
                q.add(i); 
            }
        }

        // Now BFS concept comes --> BFS chalate h
        while(!q.isEmpty()){
            int key = q.poll();
            arr[idx] = key;
            idx++;

            for(int i=0;i<adj.get(key).size();i++){
                hm.put(adj.get(key).get(i), hm.get(adj.get(key).get(i))-1);

                if(hm.get(adj.get(key).get(i)) == 0){
                    q.add(adj.get(key).get(i));
                }
            }
        }

        if(idx != numCourses){
            isCycle = true;
        }

        return isCycle;
    }
    
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int arr[] = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(numCourses);

        // Initialize adjacency list
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Traverse the matrix and populate the adjacency list
        for (int[] edge : prerequisites) {
            int dest = edge[0];
            int src = edge[1];
            adj.get(src).add(dest);
        }
        
        
        boolean cycle = topoSort(arr, adj, numCourses);

        if(cycle){
            return new int[0];
        }else{
            return arr;
        }
    }
}