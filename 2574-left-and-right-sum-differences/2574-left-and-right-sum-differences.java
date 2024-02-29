class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        int leftSum[] = new int [n];
        int rightSum[] = new int[n];
        
        if (n == 1) {
            return new int[]{0};
        }
        
        // for left
        int l_sum = 0; 
        for(int i=0;i<n;i++){
            leftSum[i] = l_sum;
            l_sum += nums[i];
        }
        
        
        //for right
        int r_sum = 0;
        for(int i=n-1;i>=0;i--){
            rightSum[i] = r_sum;
            r_sum += nums[i];
        }
        
        
        // answer[i] = |leftSum[i] - rightSum[i]|
        for(int i=0;i<n;i++){
            answer[i] = Math.abs(leftSum[i]- rightSum[i]);
        }
        
        return answer;
            
    }
}