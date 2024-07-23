class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int result[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ele = grid[i][j];
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
        }

        int i=1;
        while(i<=n*n){
            if(!map.containsKey(i)){
                result[1] = i;
                break;
            }

            i++;
        }

        // 2. Traversal using set(keys) and for each loop
        HashSet<Integer> hs = new HashSet<>(map.keySet());
        for(int key : hs ){
            if(map.get(key) == 2){
                result[0] = key;
                break;
            }
        }

    return result;

    }
}