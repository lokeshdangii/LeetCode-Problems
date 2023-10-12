class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;

        if(n==3){
            if(arr[0] < arr[1] && arr[1] > arr[2]){
                return 1;
            }
        }

        int peak_index = binarySearch(arr);
        
        return peak_index;

    }

    public int binarySearch(int arr[]){
        int n = arr.length-1;
        int start = 1;
        int end = n-2;

        if(arr[0]>arr[1]){
            return 0;
        }

        if(arr[n-1]>arr[n-2]){
            return n-1;
        }

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            }else if (arr[mid-1]<arr[mid] && arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}