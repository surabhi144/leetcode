class Solution {
    public int maxProfit(int[] prices) {
        int buy = -prices[0], profit = 0;
        for(int price : prices){
            int temp = buy;
            buy = Math.max(buy, profit - price);
            profit = Math.max(profit, temp + price);
        }
        return profit;
    }
}