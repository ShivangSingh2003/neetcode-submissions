class Solution {
    public int maxArea(int[] heights) {
        
        int start = 0;
        int end = heights.length-1;
        int maxArea = 0;
        while(start < end){
            int h1 = heights[start];
            int h2 = heights[end];
            int minHeight = Math.min(h1,h2);
            int area = minHeight * (end-start);
            if(area>maxArea)
                maxArea = area;
            else{
                if(h1 == minHeight)
                    start++;
                else
                    end--;
            }

        }

        return maxArea;
    }
}
