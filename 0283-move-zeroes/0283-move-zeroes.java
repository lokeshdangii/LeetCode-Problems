class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0, j = 0;

        while(j<n){
            if(nums[j]!=0){
                nums[i++] = nums[j]; 
            }
            j++;
        } 

        while(i<n){
            nums[i++] = 0;
        }

        return;
    }
}