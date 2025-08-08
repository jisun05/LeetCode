class Solution {
    public int maxProfit(int[] prices) {

        int lower = Integer.MAX_VALUE;
        int max =0;
        for(int i=0; i<prices.length;i++){
            lower = Math.min(lower, prices[i]);
            max = Math.max(max, prices[i] - lower);

        }
         return max;
    }
   
}