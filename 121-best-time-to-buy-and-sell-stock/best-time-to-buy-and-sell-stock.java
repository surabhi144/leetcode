class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0;
        for(int price : prices){
            buy = Math.min(buy, price);
            profit = Math.max(profit, price - buy);
        }
        return profit;
    }
}