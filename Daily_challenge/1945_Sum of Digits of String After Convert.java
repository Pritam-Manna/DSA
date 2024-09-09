class Solution {
    public int getLucky(String s, int k) {
        int len = s.length();
        int temp;
        int ans = 0;

        for(int i=0; i<len; i++){
        	temp = s.charAt(i);
        	ans = ans + getSum(temp - 96);
        }

        for(int i=0; i<k-1; i++){
        	if(ans/10 == 0){
      				break;
        	}else{
        		ans = getSum(ans);
        	}
        }

        return ans;
    }

    public int getSum(int num){
    	int sum = 0;
    	while(num!=0){
    		sum = sum + (num % 10);
    		num = num / 10;
    	}
    	return sum;
    }
}