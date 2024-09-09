class Solution {
    public boolean isPalindrome(String s) {
        int asciiVal1;
        int asciiVal2;
        int low = 0;
        int high = s.length() - 1;
        int mid = (s.length() -1) / 2;

        if(s.length() == 1){
            return true;
        }

        while(low<high){
            asciiVal1 = s.charAt(low);
            asciiVal2 = s.charAt(high);
            if(!(asciiVal1>=65 && asciiVal1<=90) && !(asciiVal1>=97 && asciiVal1<=122) && !(asciiVal1>=48 && asciiVal1<=57)){
                low++;
                continue;
            }
            if(!(asciiVal2>=65 && asciiVal2<=90) && !(asciiVal2>=97 && asciiVal2<=122) && !(asciiVal2>=48 && asciiVal2<=57)){
                high--;
                continue;
            }

            if(asciiVal1 != asciiVal2){
                if(asciiVal1>=48 && asciiVal1<=57 || asciiVal2>=48 && asciiVal2<=57){
                    return false;
                }else if(asciiVal1>asciiVal2 && asciiVal1 != asciiVal2+32){
                    return false;
                }else if(asciiVal1<asciiVal2 && asciiVal1+32 != asciiVal2){
                    return false;
                }
            }
            low++;
            high--;
        }
        return true;
    }
}