class Solution {
    public int countPrimes(int n) {

        if(n==0 || n == 1){
            return 0;
        }

        // initial state
        boolean prime[] = new boolean[n];
        Arrays.fill(prime,true); 
        prime[0] = prime[1] = false;
        int ans = 0;

        int sqrt = (int) Math.sqrt(n);
        for(int i=2;i<n;i++){
            if(prime[i]){
                ans++;
               
               for(int j=2*i;j<n;j=j+i){
                    prime[j] = false;
               }
            }
        }

    return ans;
    }
}