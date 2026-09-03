class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int maxArea = 0;
        int left = 0;
        int right = 0;

        for(int i = 0; i < heights.length; i++){

            if(i>0 && heights[i] == heights[i-1]) continue;
            if(i == 0) left = 0;
            else left = i-1;

            if(i == heights.length-1) right = heights.length-1;
            else right = i+1;

            while(left>=0 && heights[left]>=heights[i]){
                left--;
            }
            while(right<heights.length && heights[right]>=heights[i]){
                right++;
            }

            int area = (right - left - 1)*heights[i];
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}
