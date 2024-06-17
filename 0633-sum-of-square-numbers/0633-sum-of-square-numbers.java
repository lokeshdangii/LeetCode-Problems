class Solution {
    public boolean judgeSquareSum(int c) {
        
        int a = 0;
        long b = (int) Math.sqrt(c);

        while(a<=b){
            long sqsum = a*a + b*b;
            if(sqsum == c) return true;

            if(sqsum > c){
                b--;
            }else{
                a++;
            }
        }

        return false;
    }
}