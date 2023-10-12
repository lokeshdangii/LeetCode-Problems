class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;

        // for single element
        if(n==1){
            return 0;
        }

        // for two element
        if(n==2){
            if(arr[0]>arr[1]){
                return 0;
            }else{
                return 1;
            }
        }

        // for three element
        if(n==3){

            if(arr[2]>arr[1] && arr[1]>arr[0]){
                return 2;
            }

            if(arr[0] < arr[1] && arr[1] > arr[2]){
                return 1;
            }
        }


        int peak_index = binarySearch(arr);
        return peak_index;

    }

    // binary search to return the peak index
    public int binarySearch(int arr[]){
        int n = arr.length;
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
