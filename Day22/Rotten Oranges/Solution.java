class Solution
{
    
    public boolean isSafe(int i, int j, int n, int m){
        if(i>=0 && i<n && j>=0 && j<m){
            return true;
        }
        return false;
    }
    
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        
        boolean changed = false;
        int no = 2;
        
        
        while(true){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    
                    if(grid[i][j] == no){
                        
                        if(isSafe(i+1, j, n, m) && grid[i+1][j] == 1){
                            grid[i+1][j] = grid[i][j]+1;
                            changed = true;
                        }
                        
                        if(isSafe(i, j+1, n, m) && grid[i][j+1] == 1){
                            grid[i][j+1] = grid[i][j]+1;
                            changed = true;
                        }
                        
                        if(isSafe(i-1, j, n, m) && grid[i-1][j] == 1){
                            grid[i-1][j] = grid[i][j]+1;
                            changed = true;
                        }
                        
                        if(isSafe(i, j-1, n, m) && grid[i][j-1] == 1){
                            grid[i][j-1] = grid[i][j]+1;
                            changed = true;
                        }
                    }
                }
            }
            
            if(!changed){
                break;
            }
            changed = false;
            no++;
        }
        
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        
        
        return no-2;
    }
}