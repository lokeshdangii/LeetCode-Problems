class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums)
            set.add(ele);


        Arrays.sort(nums);

        for(int i=n-1;i>=0;i--){
            if(set.contains(nums[i]) && set.contains(nums[i]*-1)){
                return nums[i];
            }
        }

        return -1;
    }

    
}