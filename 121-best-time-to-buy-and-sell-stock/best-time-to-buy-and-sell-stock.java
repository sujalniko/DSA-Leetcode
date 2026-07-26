class Solution {
    public int maxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int profit = 0;
        for(int n : prices){
            price = Math.min(price, n);
            profit = Math.max(profit, n - price);
        }
        return profit;
    }
}