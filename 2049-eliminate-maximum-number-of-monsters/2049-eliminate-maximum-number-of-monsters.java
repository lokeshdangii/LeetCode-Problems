class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double time[] = new double [n];

        for(int i=0;i<n;i++){
            time[i] = (double)dist[i]/speed[i];
        }

        // Arrays.sort(time);
        insertionSort(time);

        for(int i=0;i<n;i++){
            if(time[i] <= i){
                return i;
            }
        }

        return n;
    }


    // sorting function
    public static void insertionSort(double arr[]){
        // array length
        int n = arr.length;       
        for(int i=1;i<n;i++){
            double ele = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>ele){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = ele;
        }
        // // loop to print array
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        // }
    }
}