class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        int indx = 0;
        boolean dont_stop = true;
        if(len == 0){
        	return "";
        }else if(len == 1){
        	return strs[0];
        }else{
        	while(dont_stop){
	        	for(int i=0;i<len-1;i++){
	        		if(strs[i].length()-1<indx || strs[i+1].length()-1<indx){
	        			dont_stop = false;
	        		}else if(strs[i].charAt(indx) != strs[i+1].charAt(indx)){
	        			dont_stop = false;
	        		}
	        	}
	        	indx++;
	        }

	        return strs[0].substring(0, indx-1);
        }
        
    }
}