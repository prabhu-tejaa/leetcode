// Last updated: 4/1/2025, 2:01:59 AM
class Solution {
    public int maxArea(int[] height) {
        int heightLength = height.length;
        int leftPointer = 0;
        int rightPointer = heightLength-1;
        int max = 0;

        while(leftPointer < rightPointer){
            int lenght = Math.min(height[leftPointer], height[rightPointer]);
            int width = rightPointer-leftPointer;
            int area = lenght * width;

            max = Math.max(area, max);

            if(height[leftPointer] < height[rightPointer]){
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return max;
    }
}