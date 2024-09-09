class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character, Integer> rand = new HashMap <Character, Integer>();
        Character curChar;
        int randLen = ransomNote.length();
        int magLen = magazine.length();
        boolean ans = true;

        if(randLen>magLen){
            return false;
        }

        for(int i=0; i<randLen; i++){
            curChar = ransomNote.charAt(i);
            if(rand.containsKey(curChar)){
                rand.put(curChar, rand.get(curChar)+1);
            }else{
                rand.put(curChar, 1);
            }
        }

        for(int i=0; i<magLen; i++){
            curChar = magazine.charAt(i);
            if(rand.containsKey(curChar)){
                rand.put(curChar, rand.get(curChar)-1);
            }
        }

        for (int val : rand.values()){
            if(val>0){
                ans = false;
                break;
            }
        }

        return ans;
    }
}