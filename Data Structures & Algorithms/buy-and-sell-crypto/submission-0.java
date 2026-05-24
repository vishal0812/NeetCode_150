class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            else{
                int sell = prices[i] - buy;
                maxProfit = Math.max(maxProfit, sell);
            }
        }
        return maxProfit;
    }
}
