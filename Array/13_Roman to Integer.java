class Solution {
    public int romanToInt(String s) {
        HashMap <String, Integer> roman = new HashMap <>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);


        int ans = 0;
        int prev = 0;
        int cur = 0;

        for(int i=0; i<s.length(); i++){
            
            cur = roman.get(s.substring(i,i+1));

            if(cur>prev){
                ans = ans + cur - (prev*2);
            }else{
                ans = ans + cur;
            }

            prev = cur;
        }

        return ans;
    }
}