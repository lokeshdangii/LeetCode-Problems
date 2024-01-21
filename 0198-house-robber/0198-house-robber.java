class Solution {
    public int rob(int[] nums) {
        
        // if single element
        if(nums.length == 1){
            return nums[0];
        }

        int dp[] = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2]+ nums[i],dp[i-1]);
        }

        return dp[nums.length-1];
    }
}


/*
    public int rob(int[] nums) {
        int n = nums.length;
        int first_sum = 0;
        int second_sum = 0;
        int first_adv = 0;
        int second_adv = 0;

        for(int i=0;i<n;i++){
            first_sum += nums[i];
            i++;
        }

        for(int i=1;i<n;i++){
            second_sum += nums[i];
            i++;
        }

        for(int i=0;i<n;i++){
            first_adv += nums[i];
            if(i+3 < n && nums[i+3] > nums[i+2]){
                i+=2;
            }else{
                i++;
            }
            
        }

        for(int i=1;i<n;i++){
            second_adv += nums[i];
            if(i+3 < n && nums[i+3] > nums[i+2]){
                i+=2;
            }else{
                i++;
            }
        }

        first_sum = Math.max(first_sum,first_adv);
        second_sum = Math.max(second_sum,second_adv);

        return Math.max(first_sum,second_sum);
    }
 */