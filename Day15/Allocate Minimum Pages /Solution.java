
public class Solution {

    public static boolean isPossible(int []arr, int size, int students, int curr_min){
        int curr_sum = 0;
        int studentrequired = 1;

        for(int i=0; i<size; i++){
            curr_sum += arr[i];

            if(curr_sum > curr_min){
                studentrequired++;

                curr_sum = arr[i];
            }
        }

        return studentrequired <= students;


    }

    public static int minimumPages(int []arr, int students){
        int n = arr.length;
        
        if(n<students){
            return -1;
        }

        int sum = 0;
        for(int i=0; i< n; i++){
            sum += arr[i];
        }

        int start = arr[n-1];
        int end = sum;

        int result = Integer.MAX_VALUE;
        while(start <= end){

            int mid = (start+end)/2;

            if(isPossible(arr, n, students, mid)){
                result = mid;

                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return result;
        
    }    


    public static void main(String[] args) {
        int arr[] = { 12, 34, 67,90 };
        int m = 2;


        System.out.println(minimumPages(arr, m));
    }
}
