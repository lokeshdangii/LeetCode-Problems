class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        insertion_sort(nums);

        for(int i=0;i<n;i++){
            if(nums[i] != i){
                return i;
            }
        }

    return n;
    }

// insertion sort
    public void insertion_sort(int nums[]){
        int n = nums.length;
        for(int i=1;i<n;i++){
            int key = nums[i];
            int j = i-1;

            while(j>=0 && nums[j]>key)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
}