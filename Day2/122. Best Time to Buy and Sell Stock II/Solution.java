class Solution {
    public int maxProfit(int[] prices) {
        
        int min_profit = prices[0];

        int max_profit = 0;

        for(int i=0; i<prices.length; i++){

            int cost = prices[i] - min_profit;
            if(cost>0){
                max_profit = max_profit + cost;
            }

            min_profit = prices[i];
        }

        return max_profit;
    }
}