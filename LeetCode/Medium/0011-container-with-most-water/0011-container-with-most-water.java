class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int area = 0;
        
        while (left < right) {
            int vertical = Math.min(height[left], height[right]);
            int length = right - left;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            
            area = Math.max(area, vertical * length);
        }
        
        return area;
    }
}