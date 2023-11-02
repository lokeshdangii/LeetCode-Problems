class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            // if mid points to the target
            if (arr[mid] == target)
                return mid;

            // if left part is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    // element exists
                    high = mid - 1;
                } else {
                    // element does not exist
                    low = mid + 1;
                }
            } else { // if right part is sorted
                if (arr[mid] <= target && target <= arr[high]) {
                    // element exists
                    low = mid + 1;
                } else {
                    // element does not exist
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}



/*
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        if(n==2){
            if(nums[0] == target){
                return 0;
            }else if(nums[1] == target){
                return 1;
            }else{
                return -1;
            }
        }


        int low = 0, high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(mid == 2 && nums[mid-1] == target){
                return (mid-1);
            }

            if(nums[low]<nums[mid]){   // left half sorted array
                if( target >= nums[low] && target <= nums[mid]){
                    high = mid-1;
                }else {
                    low = mid + 1;
                }
            }
            // for righ sorted part
            else 
            {
                if(target > nums[mid] && target <= nums[high]){
                    low = mid +1;
                    // if(nums[high] == target){
                    //     return high;
                    // }
                }else {
                    high = mid -1;
                }
            }
        }

        return -1;
    }
}
*/