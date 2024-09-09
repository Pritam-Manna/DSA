class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        int j,k,total;
        for(int i=0; i<len-2; i++){
            if(i> 0 && nums[i] == nums[i-1]){
                continue;
            }
            j = i+1;
            k = len-1;
            
            while(j<k){
                total = nums[i] + nums[j] + nums[k];
                //System.out.println(nums[i] + "["+i+"] "+ nums[j] + "["+j+"] "+ nums[k] + "["+k+"] ="+ total);
                if(total == 0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                }else if(total > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }

        return ans;
    }
}