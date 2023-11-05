class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        int currentWinner = arr[0];
        int consecutiveWins = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > currentWinner) {
                currentWinner = arr[i];
                consecutiveWins = 1;
            } else {
                consecutiveWins++;
            }

            if (consecutiveWins == k) {
                return currentWinner;
            }
        }

        return currentWinner;
    }
}







// My solution 

// class Solution {
//     public int getWinner(int[] arr, int k) {
//         int n = arr.length;
//         int curr_winner = arr[0];
//         int prev_winner = arr[0];
//         int count = 1;

//         for(int pass=0;pass<n;pass++){

//             // when 1st element is winner
//             if(arr[1]>arr[0]){
//                 curr_winner = arr[1];
//                 int temp = arr[0];
//                 arr[0] = arr[1];

//                 for(int i=2;i<n;i++){
//                     arr[i-1] = arr[i];
//                 }       
//                 arr[n-1] = temp;   
//             }
//             // when 2nd element is winner
//             else{
//                 curr_winner = arr[0];
//                 int temp = arr[1];
//                 for(int i=2;i<n;i++){
//                     arr[i-1] = arr[i];
//                 }
//                 arr[n-1] = temp;
//             }

//             // for verifyin winner to inc or dec count
//             if(curr_winner == prev_winner){
//                 count++;
//             }else{
//                 count = 1;
//             }

//             if(count == k){
//                 return curr_winner;
//             }
//         }

//         return prev_winner;
//         }
//     }