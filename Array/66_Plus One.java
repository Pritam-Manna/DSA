class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int [] digitsNew = new int [length+1];
        int ex = 1;
        int temp = 0;

        for(int i=length-1; i>=0; i--){
            temp = digits[i] + ex;
            if(temp == 10){
                ex = 1;
                digits[i] = 0;
            }else{
                ex = 0;
                digits[i] = temp;
            }
        }

        if(ex == 0){
            return digits;
        }else{
            digitsNew[0] = 1;
            for(int i=0; i<length; i++){
                 digitsNew[i+1] = digits[i];
            }

            return digitsNew;
        }
    }
}