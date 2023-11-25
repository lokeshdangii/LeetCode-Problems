class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele : nums)
            hm.put(ele,hm.getOrDefault(ele,0)+1);

        for(Integer key : hm.keySet()){
            if(hm.get(key) == 1){
                sum += key;
            }
        }


        return sum;
    }
}