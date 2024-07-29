
public class Solution {

    public static void reverseArray(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static boolean isSorted(int []arr){
        int x = -1;
        int y = -1;
        int n = arr.length -1;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                if(x != -1){
                    x = i;
                }
                y = i+1;
            }
        }

       if(x != -1){
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
       }

       return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 3 };

        System.out.println(isSorted(arr));
    }
}