class Solution {
    public int maximumDifference(int[] nums) {

        int n = nums.length;

        int result = nums[1] - nums[0];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                result = Math.max(result,nums[j]-nums[i]);
            }
        }

    if(result <= 0){
        return -1;
    }
        return result;
        
    }
}