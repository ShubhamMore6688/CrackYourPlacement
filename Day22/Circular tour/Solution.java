class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	    int N = petrol.length;
	    int total_petrol = 0;
	    int total_distance = 0;
	    
	    for(int i=0; i<N; i++){
	        total_petrol += petrol[i];
	        total_distance += distance[i];
	    }
	    
	    if(total_petrol < total_distance){
	        return -1;
	    }
	    
	    int start = 0;
	    
	    for(int i=0; i<N; i++){
	        if(petrol[i] >= distance[i]){
	            start = i;
	        }
	    }
	    
	    int curr_petrol = 0;
	    
	    for(int i= start; i<N; i++){
	        curr_petrol += petrol[i]-distance[i];
	        
	        
	        
	        if(curr_petrol < 0){
	            start = i+1;
	            curr_petrol = 0;
	        }
	    }
	    
	    return start;
    }
}