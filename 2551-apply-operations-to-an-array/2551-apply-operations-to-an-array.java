class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int zeroes = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
                zeroes++;
            }
        }

        // shifting zeroes to the end of an array
        int i=0, j = 0;

        while(j<n){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }

            j++;
        }

        while(i<n){
            nums[i] = 0;
            i++;
        }

        return nums;
    }
}