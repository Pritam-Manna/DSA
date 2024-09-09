class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int len = arr.length;
        boolean ans = true;

        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i=0; i<len; i++){
            if(target[i] != arr[i]){
                ans = false;
                break;
            }
        }
        return ans;
    }
}