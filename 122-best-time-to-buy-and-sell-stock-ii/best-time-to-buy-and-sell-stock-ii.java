class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxprofit = 0;
        for(int i = 0; i<prices.length; i++){
            int sell = prices[i];
            if(sell - buy > 0){
                maxprofit += (sell-buy);
                buy = prices[i];
            }
            buy = Math.min(buy, prices[i]);
        }
        return maxprofit;
    }
}