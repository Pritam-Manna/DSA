class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxArea = calculateArea(l, r, height);

        while (l < r) {
            if (height[l] < height[r]) {
                l++;
                while (height[l-1] >= height[l] && l < r) {
                    l++;
                }
                int area = calculateArea(l, r, height);
                if (maxArea < area) {
                    maxArea = area;
                }
            } else {
                r--;
                while (height[r+1] >= height[r] && l < r) {
                    r--;
                }
                int area = calculateArea(l, r, height);
                if (maxArea < area) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public int calculateArea(int l, int r, int[] arr) {
        if (l == r) {
            return 0;
        }
        int length = Math.min(arr[l], arr[r]);
        int width = r - l;
        return length * width;
    }
}