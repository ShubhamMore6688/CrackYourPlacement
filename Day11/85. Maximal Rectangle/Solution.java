class Solution {
    public int maxAreaOfRectangle(int[] arr){
        int area = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            int minHeight = arr[i];

            for(int j=i; j<arr.length; j++){
                minHeight = Math.min(minHeight, arr[j]);

                int width = j-i+1;

                int temparea = minHeight * width;
                area = Math.max(area, temparea);
                
            }
        }

        return area;
    }
    public int maximalRectangle(char[][] matrix) {
        
        int n = matrix.length; 
        int m = matrix[0].length;
        int []arr = new int[m];
        int maxArea = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(matrix[i][j] == '1'){
                    arr[j]++;
                }else {
                    arr[j] = 0;
                }


            }
            int area = maxAreaOfRectangle(arr);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}