class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int ele : nums){  // storing nums element in hm
            hm.put(ele, hm.getOrDefault(ele,0)+1);
        }  

        // 2. Traversal using set(keys) and for each loop
        HashSet<Integer> hs = new HashSet<>(hm.keySet());
        for(int key : hs ){
            if(hm.get(key) > n/2){
                return key;
            }
        }

        return 1;  
    }
}