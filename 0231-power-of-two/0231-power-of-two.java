class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n == 1){
            return true;
        }

        if(n == 3){
            return false;
        }
         if(n/2 ==1){
            return true;
        }
       
        if (n>2 &&  n%2== 0){
            n = n/2;
            return isPowerOfTwo(n);
        }else{
            return false;
        }

    
    }
}