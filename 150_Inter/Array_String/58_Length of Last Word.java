class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int start = len;
        int ans = 0;
        for(int i=len-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                if(i+1 != start){
                    ans = start - i -1;
                    return ans;
                }
                start = i;
            }
        }
        if(start != 0){
            ans = start;
        }

        return ans;
    }
}