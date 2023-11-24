class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int element = Integer.MAX_VALUE;
        int max = 0;

        TreeMap<Integer,Integer> hm = new TreeMap<>();

        for(int ele : nums){  // storing even elements in hm
            if(ele%2 == 0){
            hm.put(ele, hm.getOrDefault(ele,0)+1);
            }
        }  

        if(hm.size() == 0)
            return -1;

        // 1. Traversal using entrySet() --> to find maximum frequeny
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            max = Math.max(max, e.getValue());
        }

        // 2. Traversal using set(keys) and for each loop to find smallest even key that has maximum frequency 
        HashSet<Integer> hs = new HashSet<>(hm.keySet());
        for(int key : hs ){
            if(hm.get(key) == max){
                element = Math.min(element, key);
            }
        }
        
        return element;
    }
}