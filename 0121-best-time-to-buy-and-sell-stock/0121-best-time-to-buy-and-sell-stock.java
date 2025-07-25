class Solution {
    public int maxProfit(int[] prices) {

        int currentMin = Integer.MAX_VALUE;
        int profit =0;

        for(int price : prices){
            currentMin = Math.min(currentMin, price);
            profit = Math.max(profit, price - currentMin);

        }


        return profit;
           
    }
}