class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int buy = 101;
        int profit = 0;
        int maxProfit = 0;

        for(int i = 0; i < len; i++){
            if(prices[i]<buy)
                buy = prices[i];
            else{
                profit = prices[i] - buy;
                if(profit > maxProfit)
                    maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
