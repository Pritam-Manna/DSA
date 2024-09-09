class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int len = bloomDay.length;

        if((long) m*k > len){
        	return -1;
        }
        int low = bloomDay[0], high = bloomDay[0];
        int mid;
        for(int i=0; i<len; i++){
        	if(low>bloomDay[i]){
        		low = bloomDay[i];
        	}else if(high<bloomDay[i]){
        		high = bloomDay[i];
        	}
        }

        while(low<high){
        	mid = low + (high-low)/2;

        	if(isPossible(bloomDay, m, k, mid)){
        		high = mid;
        	}else{
        		low = mid+1;
        	}
        }

        return low;
    }

    private boolean isPossible (int [] bloomDay, int m, int k, int day){
    	int total = 0, count = 0;
    	int len = bloomDay.length;
    	for(int i=0; i<len; i++){
    		count = 0;

    		while(i<len && count<k && bloomDay[i]<=day){
    			count ++;
    			i++;
    		}
    		if(count == k){
    			total++;
    			i--;
    		}
    		if(total == m){
    			return true;
    		}
    	}
    	return false;
    }
}