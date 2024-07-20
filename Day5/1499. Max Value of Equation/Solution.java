class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int m = points.length;
        int n = points[0].length;

        int temp = 0;
        int maxx = Integer.MIN_VALUE;
      


        for(int i=0; i<m; i++){
            for(int j=i+1; j<m; j++){
                long cond = Math.abs((long)(points[i][0])-(long)(points[j][0]));
                if(cond <= k){
                    long cnt = (long)(points[i][1])+(long)(points[j][1])+cond;
                    maxx = Math.max(maxx, (int)cnt);
                   
                }
            }
        }


       return maxx;
    }
}