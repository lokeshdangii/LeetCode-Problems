class Solution {
    public int removeDuplicates(int[] nums) {
        
        TreeSet<Integer> set = new TreeSet<>();

        for(int ele : nums){
            set.add(ele);
        }

        int idx =0;
        for(int key : set){
            nums[idx++] = key;
        }

        return set.size();
    }
}