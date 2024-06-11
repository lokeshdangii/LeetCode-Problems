class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        TreeMap<Integer, Integer> hm = new TreeMap<>();

        for(int ele : arr1)
            hm.put(ele, hm.getOrDefault(ele, 0)+1);

        int idx = 0;
        for(int ele : arr2){
            for(int i=0;i<hm.get(ele);i++){
                arr1[idx++] = ele;
            }

            hm.remove(ele);
        }    

        ArrayList<Integer> list = new ArrayList<>();  
        HashSet<Integer> hs = new HashSet<>(hm.keySet());

        for(int key : hs ){
            for(int i=0;i<hm.get(key);i++){
                list.add(key);
            }
        }   

        // Sorting the ArrayList in ascending order
        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            arr1[idx++] = list.get(i); 
        }

        return arr1;
    }
}