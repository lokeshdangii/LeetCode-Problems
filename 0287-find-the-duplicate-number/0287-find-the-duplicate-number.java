class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;    
        int count[] = new int[n];  // array to count frequencies of elements

        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }

        for(int i=0;i<n;i++){
            if(count[nums[i]]>1){
                return nums[i];
            }
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