class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();

        if(numRows>=len || numRows == 1){
            return s;
        }else{
            StringBuilder ans = new StringBuilder(); 
            int i = 0,cur = 0, next = 0;
            for(int j=0; j<numRows; j++){
                i= 0;
                next = 0;
                while(next<=len-1){
                    cur = 2*i*(numRows-1)+j;
                    next = 2*(i+1)*(numRows-1)-j;
                    if(cur<=len-1){
                        // System.out.println("j = "+j+", cur ="+cur);
                        ans.append(s.charAt(cur));
                    }else{
                        break;
                    }

                    if(next <= len-1 && next != cur && j!=0){
                        // System.out.println("j = "+j+", next ="+next);
                        ans.append(s.charAt(next));
                    }
                    i++;
                }
            }
            return ans.toString();
        }        
    }
}