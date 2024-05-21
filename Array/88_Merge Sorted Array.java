class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] finalNum = new int [m+n];
        int left = 0;
        int right = 0;
        int i = 0;

        if(n == 0){
            return;
        }

        while(left < m && right > n){
            if(nums1[left]<nums2[right]){
                finalNum[i] = nums1[left];
                left ++;
            }else{
                finalNum[i] = nums2[right];
                right++;
            }
            i++;
        }

        if(left<m){
            for (int j=left; j<m; j++) {
                finalNum[i] = nums1[j];
                i++;
            }
        }else if(right<n){
            for (int j=right; j<n; j++) {
                finalNum[i] = nums2[j];
                i++;
            }
        }

        for (int j=0; j<i; j++) {
            nums1[j] = finalNum[j];
        }
    }
}