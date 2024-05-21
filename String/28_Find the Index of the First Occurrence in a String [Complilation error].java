class Solution {
    public int strStr(String haystack, String needle) {
        int length1 = haystack.length();
        int length2 = needle.length();

        if(length2 > length1){
            return -1;
        }else{
            for(int i=0; i<=length1-length2; i++){
                if(length1< i+length2){
                    return -1;
                }else if((haystack.substring(i, i+length2)).equals(needle)){
                    return i;
                }
            }
        }
    }
}


