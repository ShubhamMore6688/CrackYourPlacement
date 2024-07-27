
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here 
        long[] p = new long[n];
        // int j =0;
        
        
        for(int j=0;j < n; j++){
            // int j = 0;
            long product = 1;
            for(int i=0; i<n; i++){
                if(j==i){
                    continue;
                }else {
                    product = product * nums[i];
                }
            }
            p[j] = product;
            // j++;
            
        }
        
  
        return p;
	} 
} 
