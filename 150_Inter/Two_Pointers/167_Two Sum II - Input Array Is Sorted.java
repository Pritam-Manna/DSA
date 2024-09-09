class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int high = numbers.length-1;
        int low = 0;
        int temp;
        int [] ans = new int[2];

        while(low<high){
            temp = target - numbers[low];
            if(numbers[high] == temp){
                break;
            }else if(numbers[high] > temp){
                high --;
            }else{
                low ++;
            }
        }
        ans[0] = low+1;
        ans[1] = high+1;
        return ans;
    }
}