class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        
       int N =1000010;
       boolean []visited = new boolean[N];
       
        for(int i=0; i<size; i++){
            
            if(arr[i] > 0 && arr[i] <= size){
                visited[arr[i]] = true;
            }
        }
        
        for(int i=1; i<N; i++){
            if(!visited[i]){
                return i;
            }
        }
        
        return arr[size-1]+1;
    }
}
