class Solution {
    public void swap(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;

        for(int right=0; right<n; right++){
            if(nums[right]!=0){
                swap(nums, left, right);
                left++;
            }
                 
         }
        
    }
}