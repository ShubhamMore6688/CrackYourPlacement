class Solution {
    public int minMoves2(int[] nums) {
        int minMove = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int digit = nums[n/2];

     
        for(int i=0; i<n; i++){
            minMove += Math.abs(nums[i]-digit);


        }

        return minMove;
    }
}