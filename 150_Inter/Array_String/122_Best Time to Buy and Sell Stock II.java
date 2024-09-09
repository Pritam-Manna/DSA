class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int hold = prices[0];
        int profit = 0;

        if(length == 1){
            return profit;
        }

        for(int i=1; i<length; i++){
            if(hold >= prices[i]){
                hold = prices[i];
            }else{
                profit += prices[i] - hold;
                hold = prices[i];
            }
        }

        return profit;
    }
}