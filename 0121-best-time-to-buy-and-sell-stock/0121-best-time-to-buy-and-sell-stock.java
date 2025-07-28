class Solution {
    public int maxProfit(int[] prices) {

        int lowPrice=10000;
    
        int maxProfit =0;
        for(int i=0;i<prices.length;i++){
           int profit = prices[i] - lowPrice; 
            maxProfit = Math.max(profit, maxProfit);
            lowPrice = Math.min(lowPrice, prices[i]);
        }
        return maxProfit;
    }
}