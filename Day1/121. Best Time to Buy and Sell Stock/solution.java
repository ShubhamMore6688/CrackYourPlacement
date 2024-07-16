class Solution {
    public int maxProfit(int[] prices) {
        int maxx = prices[0];
        int profit = -1;
        for(int i=0; i<prices.length; i++){
            int cost = prices[i] - maxx;
            profit = Math.max(cost, profit);
            maxx  = Math.min(maxx, prices[i]);
        }

        return profit;
        
    }
}