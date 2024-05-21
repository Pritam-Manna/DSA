class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;

        if(length == 1){
            return 1;
        }

        int [] finalArr = new int [length];
        int j = 0;

        for(int i=0; i<length-1; i++){
            if(nums[i] != nums[i+1]){
                finalArr[j] = nums[i];
                j++; 
            }
        }

        finalArr[j] = nums[length-1];
        j++; 

        if(j != length){
            for(int i=0; i<j; i++){
                nums[i] = finalArr[i];
            }
        }
        

        return j;
    }
}