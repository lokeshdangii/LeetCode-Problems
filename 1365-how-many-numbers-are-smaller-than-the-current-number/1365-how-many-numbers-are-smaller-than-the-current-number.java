class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        
        for(int i=0;i<n;i++){
            int ele = nums[i];
            int smaller_nums = 0;
            
            for(int j=0;j<n;j++){
                if(nums[j]<ele)
                    smaller_nums++;
            }
            
            result[i] = smaller_nums;
        }
        
        return result;
    }
}