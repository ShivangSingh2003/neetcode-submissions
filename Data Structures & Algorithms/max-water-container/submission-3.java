class Solution {
    public int maxArea(int[] heights) {
        
        int start = 0;
        int end = heights.length-1;
        int maxArea = 0;
        
        while(start < end){
            int minHeight = Math.min(heights[start], heights[end]);
            int area = minHeight * (end - start);
            maxArea = Math.max(area, maxArea);
            if(heights[start] == minHeight)
                start++;
            else
                end--;
        }

        return maxArea;
    }
}
