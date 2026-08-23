class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int buy = 101;
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            buy = Math.min(buy, prices[i]);

            profit = prices[i] - buy;

            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}
