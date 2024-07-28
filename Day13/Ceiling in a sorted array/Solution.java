public class Solution {

    public static int ceil(int[] arr, int low, int high, int x){
        if(x <= arr[low]){
            return low;
        }

        if(x > arr[high]){
            return -1;
        }

        while (low<=high) {
            int mid = (low+high)/2;

            if(x == arr[mid]){
                return mid;
            }

            if(x < arr[mid]){
                high = mid -1;
            }else{
                low = mid + 1;
            }

            
        }

        return low;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int n = arr.length;

        System.out.println(ceil(arr, 0, n-1, 3));
    }
}