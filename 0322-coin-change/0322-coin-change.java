class Solution {

    public int solve(int[] coins, int amount, int dp[]){
        if(amount == 0){
            return 0;
        }

        if(amount < 0){
            return -1;
        }

        if(dp[amount] != -1){
            return dp[amount];
        }

        int mini = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int recursionKaAns = 0;
            if(amount-coins[i] >= 0){
                recursionKaAns = solve(coins, amount-coins[i], dp);
                if(recursionKaAns != Integer.MAX_VALUE){
                    int ans = 1 + recursionKaAns;
                    mini = Math.min(mini, ans);
                }
            }
            
        }
        dp[amount] = mini;
        return dp[amount];
    }

    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp, -1);
        solve(coins,amount,dp);

        int ans = solve(coins,amount,dp);
        if(ans == Integer.MAX_VALUE){
            return -1;
        }else{
            return ans;
        }
    }

}