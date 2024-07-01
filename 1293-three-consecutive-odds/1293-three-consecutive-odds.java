class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if(n==1 || n==2 ){
            return false;
        }

        if(n==3){
            if(arr[0]%2 == 1 && arr[1]%2 == 1 && arr[2]%2==1){
                return true;
            }else{
                return false;
            }
        }


        // n >=4
        boolean flag= false;
        for(int i=0;i<n-2;i++){
            if(arr[i]%2 == 1 && arr[i+1]%2 == 1 && arr[i+2]%2==1){
                flag = true;
                break;   
            }
            }
            return flag;
        }  
    }