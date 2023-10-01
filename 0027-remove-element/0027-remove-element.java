class Solution {
    public int removeElement(int[] nums, int val) {

        // will store the count of elements not equal to val
        int k = 0; 
        
        //  move elements not equal to val to the beginning
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}