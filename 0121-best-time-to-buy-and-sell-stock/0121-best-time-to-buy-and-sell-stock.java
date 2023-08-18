class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = prices[0];
        int max_profit = 0;  // to track the max profit

        if(n==1){
            return 0;
        }

        for (int i=1;i<n;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                max_profit = Math.max(max_profit,profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return max_profit;
    }
}