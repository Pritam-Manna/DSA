class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        int start=len;
        StringBuilder ans = new StringBuilder ();
        for(int i=len-1; i>=0;i--){
            // System.out.println(s.charAt(i));

            if(s.charAt(i) == ' '){
                // System.out.println("Hi");
                if(i+1 != start){
                    ans.append(s.substring(i+1, start) + " ");
                }
                start = i;
            }
        }
        if(start!=0){
             ans.append(s.substring(0, start));
        }else{
            ans.deleteCharAt(ans.length()-1);
        }
        return ans.toString();
    }
}