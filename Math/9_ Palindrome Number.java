class Solution {
public boolean isPalindrome(int x) {
        int len = (int) (Math.log10(x));
        int cx = x;
        int mid = len/2;
        int last;
        int first;
        if(x<0)
            return false;
        while(len>=mid){
            last = x%10;
            first = (int) (cx / Math.pow(10, len));
            if(last != first){
                return false;
            }
            x = x / 10;
            cx = (int) (cx % Math.pow(10, len));
            len --;
        }

        return true;

    }
}