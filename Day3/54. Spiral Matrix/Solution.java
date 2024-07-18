class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = m-1;
        int bottom = n-1;
        int top = 0;

        while(left <= bottom && top <= right){

            for(int i=top; i<=right; i++){
                list.add(matrix[left][i]);
            }
            left = left+1;
            for(int i=left; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right = right-1;

            if(left<=bottom){
                for(int i=right; i>= top; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom = bottom-1;
            }

            if(top<=right){
                for(int i=bottom; i>=left; i--){
                    list.add(matrix[i][top]);
                }
                top = top + 1;
            }

        }

        return list;
    }
}