class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int rsum = 0;
        int lsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int totalsum = 0;
        for(int i : cardPoints){
            totalsum += i;
        }

        if(k==n) return totalsum;

        for(int i=0; i<k; i++){
            lsum += cardPoints[i];
            maxsum = Math.max(maxsum, lsum);
        }

        int rindex = n-1;
        for(int i=k-1; i>=0; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[rindex];
            rindex = rindex - 1;

            maxsum = Math.max(maxsum, lsum+rsum);
        }

        return maxsum;

    }
}