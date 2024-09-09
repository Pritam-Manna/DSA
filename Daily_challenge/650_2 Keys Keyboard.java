class Solution {
    public int minSteps(int n) {
    	int ans = 0,
    		i = 2;

    	while(n/i >= 1){
    		if(n%i == 0){
    			n = n / i;
    			ans = ans + i;
    			i = 2;
    		}else{
    			i++;
    		}		
    	}

    	return ans;
    }
}



