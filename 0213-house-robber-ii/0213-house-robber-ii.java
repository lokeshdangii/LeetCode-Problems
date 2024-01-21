class Solution {
    
    public int helper(int[] nums) {
        

        int dp[] = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2]+ nums[i],dp[i-1]);
        }

        return dp[nums.length-1];
    }
    
    
    public int rob(int[] nums) {
        
        // if single element
        if(nums.length == 1){
            return nums[0];
        }
        
        int first_skip[] = new int[nums.length];
        int last_skip[]  = new int[nums.length];
        int k = 0;
        
        for(int i=0;i<nums.length;i++){
            if(i != nums.length-1){
                first_skip[k] = nums[i];
            }
            
            if(i != 0){
                last_skip[k] = nums[i];
            }
            
            k++;
            
        }

        
        int first_skip_result = helper(first_skip);
        int last_skip_result = helper(last_skip);
        
        return Math.max(first_skip_result, last_skip_result);
        
    }
}