class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        int maxprofit = 0;
        for(int i = 1; i<prices.length; i++){
            sell = prices[i];
            maxprofit = Math.max(maxprofit, sell-buy);
            buy = Math.min(buy, prices[i]);
        }
        return maxprofit;
    }
}