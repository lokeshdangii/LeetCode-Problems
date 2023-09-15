class Solution {
    public int reverse(int n) {

        int limit = (int) (Math.pow(2,31)-1);
 
        int rev = 0;

        while(n!=0){

            if(rev > Integer.MAX_VALUE/10){
                return 0;
            }

            if(rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev * 10 + n%10;
            n = n/10;
        }

         if(rev > limit){
            return 0;
        }

        return rev;
    }
}



// int num = n;
//         int rev =0;
        
//         if(n>0)
//         {
//             while(n>0)
//             {
//                 rev = rev * 10 + n%10;
//                 n = n/10;
//             }
//         }else
//         {
//             n = n + (2*n);
//             while(n>0)
//             {
//                 rev = rev * 10 + n%10;
//                 n = n/10;
//             }

//             int res = rev - 2 * rev;
//             return res;
//         }

//         return rev;