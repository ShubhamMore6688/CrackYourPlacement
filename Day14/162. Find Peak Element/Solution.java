class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        if(n==1) return 0;
        for(int i=0; i<n; i++){

            if(i==0 && nums[0] > nums[1]) return 0;
            if(i==n-1 && nums[n-1] > nums[n-2]) return n-1;

            if(i!=0 && i!=n-1){

                if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                    return i;
                }
            }
        }

        return 0;
    }
}