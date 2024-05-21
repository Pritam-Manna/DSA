class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
		int resIndx[] = new int[2];
		int temp;
		HashMap <Integer, Integer> holdElem = new HashMap<Integer, Integer>();

		for(int i=0; i<length;i++){
			temp = target - nums[i];

			if(holdElem.get(temp) != null){
				resIndx[0] = holdElem.get(temp);
				resIndx[1] = i;
			}else{
				holdElem.put(nums[i], i);
			}
		}

		return resIndx;
    }
}