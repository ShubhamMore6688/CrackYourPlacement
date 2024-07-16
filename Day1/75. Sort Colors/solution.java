class Solution {
    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        for(int i=0; i<nums.length; i++){
            while(mid<=high){
                if(nums[mid]==0){
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }else if(nums[mid]==2){
                    swap(nums, mid, high);
                    
                    high--;
                }else{
                    mid++;
                }
            }
        }
    }
}