class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int aux [] = new int[n];

        int max = 0;
        for(int i=n-1;i>=0;i--){
            max = Math.max(max,prices[i]);

            aux[i] = max;
        }

        int max_profit = 0;
        for(int i=0;i<n;i++){
             int profit = aux[i] - prices[i];
             max_profit = Math.max(profit, max_profit);
        }

        return max_profit;
    }
}