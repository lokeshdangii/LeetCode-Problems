class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maximum = 0;
        
        for(int i=0;i<n;i++){     
            for(int j=i+1;j<n;j++){
                int value = (nums[i]-1) * (nums[j]-1);
                maximum = Math.max(maximum,value);
            }   
        }
        
        return maximum;
    }
}