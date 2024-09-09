class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int i = 0;
        int k = 0;

        while(i<sLen && k<tLen && (tLen-1-k)>=sLen-1-i ){
            // System.out.println(s.charAt(i) +" : "t.charAt(k));

            if(s.charAt(i) == t.charAt(k)){
                i++;
            }
            k++;
        }

        if(i == sLen){
            return true;
        }else{
            return false;
        }
    }
}