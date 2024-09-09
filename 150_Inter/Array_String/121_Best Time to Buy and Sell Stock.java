class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int prevProf = 0;
        int currentProf = 0;
        int lastLow = prices[0];

        if(length == 1){
            return 0;
        }

        for(int i=1;i<length;i++){
            if(lastLow >= prices[i]){
                lastLow = prices[i];
                currentProf = 0;
            }else{
                currentProf = prices[i] - lastLow;
            }

            if(currentProf > prevProf){
                prevProf = currentProf;
            }
        }
        return prevProf;
    }
}