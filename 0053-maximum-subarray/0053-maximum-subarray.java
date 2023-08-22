class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        
        //track previous maximum subarray sum
        int maxPrevious = nums[0];

        for(int i=1;i<n;i++){
            maxPrevious = Math.max(maxPrevious + nums[i], nums[i]);
            sum = Math.max(maxPrevious, sum);
        }


        return sum;
        
    }
}