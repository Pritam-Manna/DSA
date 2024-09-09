class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int workerLen = worker.length;
        int diffLen = difficulty.length;
        int indx;
        int prof = 0;

        for(int i=0; i<workerLen; i++){
            indx = -1;
            for(int j=0; j<diffLen; j++){
                if((indx == -1 || profit[indx]<profit[j]) && worker[i]>=difficulty[j]){
                    indx = j;
                }
            }
            if(indx != -1){
                prof = prof + profit[indx];
            }
        }
        return prof;
    }
}


