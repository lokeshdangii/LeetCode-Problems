class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        insertion_sort(nums);


        if(n==1){
            return nums[0];
        }

        for(int i=1;i<n;i=i+2){
            if(nums[i] != nums[i-1])
            return nums[i-1];
        }

        return nums[n-1];
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