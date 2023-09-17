class Solution {
    public int mySqrt(long x) {

         if (x == 0 || x == 1) {
            return (int)x;
        }

        long low = 1;
        long high = x;
        long root = 0;

        while(low<=high){

            long mid = low + (high - low) / 2;
            long msq = mid * mid;

            if (msq == x){
                return (int)mid;
            }else if(msq > x){
                high = mid -1;
            }else{
                low = mid +1;
                root = mid;
            }
        }

        return (int)root;

    }
}