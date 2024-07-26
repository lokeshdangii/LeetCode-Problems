class Solution {

    public void bubble(int [] nums){

        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<=n-1;j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int arr[]){
            for(int i=1; i<arr.length-1;i++){
                int curr = arr[i];
                int prev = i-1;
                
                // finding out the correct position to insert
                while(prev>=0 && arr[prev] < curr){
                    arr[prev+1] = arr[prev];
                    prev--;
                }
                 // insertion
                 arr[prev+1] = curr;

            }
        }

    public static void selectionSort(int arr[]){
            for(int i =0; i<arr.length-1;i++){
                int minPos = i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[minPos]< arr[j]){
                        minPos = j;
                    }
                }
                //swap
                  int temp = arr[minPos];
                  arr[minPos] = arr[i];
                  arr[i] = temp;
            }

        }


    public static void mergeSort(int arr[], int si, int ei){
     if(si>=ei){
        return;  
     }
        // kaam
            int mid = (si + (ei-si))/2; // (si+ei)/2
            mergeSort(arr,si,mid); // left part
            mergeSort(arr, mid+1, ei);

            merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid +1; // iterator for right part
        int k = 0; // iterator for tem arr

        while(i <= mid && j <= ei){
            if(arr[i]< arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // leftpart
        while(i <= mid){
           temp[k++] = arr[i++];
        }
          // rightpart
          while(j <= ei){
            temp[k++] = arr[j++];
         }

         // copy item to original arr
           for(k=0, i=si; k<temp.length; k++, i++){
               arr[i] = temp[k];
           }    
    }


    public int[] sortArray(int[] nums) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele: nums){

            pq.add(ele);
        } 

        for(int i=0; i<nums.length; i++){

            nums[i]= pq.poll();
        }
        return nums;
    }
}