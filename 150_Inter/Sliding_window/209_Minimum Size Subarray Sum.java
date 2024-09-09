class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int ans = Integer.MAX_VALUE, left = 0, temp =0;

        for(int right=0; right<len; right++){
            temp += nums[right];
            while(temp>=target){
                ans = Math.min(ans, right-left+1);
                temp -= nums[left];
                left ++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}