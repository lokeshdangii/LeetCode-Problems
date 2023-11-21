class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2];
        insertion_sort(nums);

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ans[0] = nums[i];
            }
        }

        // Find the missing number
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                ans[1] = nums[i] + 1;
            }
        }

        // Handle the case where the missing number is at the beginning or end
        if (nums[0] != 1) {
            ans[1] = 1;
        } else if (nums[n - 1] != n) {
            ans[1] = n;
        }

        return ans;
    }

    // insertion sort
    public void insertion_sort(int nums[]) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
