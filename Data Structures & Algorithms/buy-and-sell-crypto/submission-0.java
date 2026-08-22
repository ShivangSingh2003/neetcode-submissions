class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int buy = 101;
        int profit = 0;
        int maxProfit = 0;

        for(int i = 0; i < len-1; i++){
            if(prices[i]<buy)
                buy = prices[i];
            for(int j = i+1; j < len; j++){
                profit = prices[j] - buy;
                if(profit > maxProfit)
                    maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
