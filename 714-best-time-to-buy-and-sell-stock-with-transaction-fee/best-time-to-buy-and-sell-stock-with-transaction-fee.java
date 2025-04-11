class Solution {
    public int maxProfit(int[] prices, int fee) {
        int hold = -prices[0];
        int free = 0;
        for(int price : prices){
            int temp = hold;
            hold = Math.max(hold, free - price);
            free = Math.max(free, temp + price - fee);
        }
        return free;
    }
}