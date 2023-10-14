class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int[]dp=new int[cost.length+1];
        Arrays.fill(dp, (int) 1e9);
        dp[0]=0;
        for(int i = 0; i < dp.length-1; ++i) {
          for(int j=dp.length-1; j>0 ; j--){
            dp[j] = Math.min(dp[j], dp[Math.max(j - time[i] - 1, 0)] + cost[i]);
          }
      }    
      return dp[dp.length-1];
    }
}