class Solution {
    public int[] searchRange(int[] nums, int target) {
        
         int n = nums.length;
        int[] res = new int[2];
        int low = 0;
        int high = n - 1;
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        // Binary search to find the first occurrence of target
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                firstOccurrence = mid;
                high = mid - 1; // Continue searching on the left side for the first occurrence
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If target is not found, return [-1, -1]
        if (firstOccurrence == -1) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }

        lastOccurrence = firstOccurrence;

        // Reset low and high for the second binary search
        low = firstOccurrence + 1;
        high = n - 1;

        // Binary search to find the last occurrence of target
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                lastOccurrence = mid;
                low = mid + 1; // Continue searching on the right side for the last occurrence
            } else {
                high = mid - 1;
            }
        }

        res[0] = firstOccurrence;
        res[1] = lastOccurrence;
        return res;
    }
}