class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;
        for(String dir : logs){
            if( dir.equals("../")){
                if(ans!=0){
                    ans --;
                }
                
            }else if(!dir.equals( "./")){
                ans ++;
            }
        }
        if(ans<0){
            return 0;
        }else{
            return ans;
        }
    }
}
