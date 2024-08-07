class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int arr[] = new int[m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    
                    arr[j] += 1;
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        int index = -1;
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i] >= max){
               max = arr[i];
               index = i;
            }
        }
        
        if(max >= 1 && arr.length > 1) {
            return index;
            
        }else if(arr.length == 1){
            return index;
        }
        return -1;
    }
}