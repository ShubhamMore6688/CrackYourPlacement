class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxx = Integer.MIN_VALUE;
        
        
        for(int i=0; i<heights.length; i++){
           int minHeight = heights[i];
           for(int j=i; j<heights.length; j++){
            minHeight = Math.min(minHeight, heights[j]);

            int width = j-i+1;
            int area = minHeight * width;

            maxx = Math.max(maxx, area);
           }

        }
        return maxx;
    }
}