class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minSoFar = prices[0];
        int maxProfit = 0;

        for(int i=1;i<n;i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i]- minSoFar;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}