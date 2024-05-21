class Solution {
    public int removeElement(int[] nums, int val) {

        int length = nums.length;
        int total = 0;

        if(length == 0){
            return 0;
        }

        for(int i=0; i<length-1; i++){
            if(nums[i] == val){
                nums[total] = nums[i+1];
                
            }else{
                nums[total] = nums[i];
                total ++;
            }
        }

        if(nums[length-1] != val){
            nums[total] = nums[length-1];
                total ++;
        }
        
        return total;
    }
}
