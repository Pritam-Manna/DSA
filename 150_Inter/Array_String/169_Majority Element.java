class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> count = new HashMap <Integer, Integer> ();
        int length = nums.length;
        int ans = 0;

        if(length ==1){
            return nums[0];
        }

        for(int i=0;i<length;i++){
            if(count.get(nums[i]) != null){
                if(count.get(nums[i]) == (length/2)){
                    ans = nums[i];
                    break;
                }else{
                    count.put(nums[i], count.get(nums[i]) + 1);
                }
            }else{
                count.put(nums[i], 1);
            }
        }

        return ans;
    }
}