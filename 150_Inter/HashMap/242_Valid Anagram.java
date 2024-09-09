class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> stMap = new HashMap <Character, Integer>();
        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen){
            return false;
        }else{
            for(int i=0; i<sLen; i++){
                stMap.put(s.charAt(i), stMap.getOrDefault(s.charAt(i), 0) + 1);
                stMap.put(t.charAt(i), stMap.getOrDefault(t.charAt(i), 0) - 1);
            }

            for(int i=0; i<sLen; i++){
                if(stMap.get(s.charAt(i)) != 0){
                    return false;
                }
            }
            return true;
        }
    }
}