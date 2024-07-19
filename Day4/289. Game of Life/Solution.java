class Solution {
    public boolean isValidNeighbor(int x, int y, int[][] board){
        if(x >= 0 && x < board.length && y>=0 && y < board[0].length){
            return true;
        }
        return false;
    }
    public void gameOfLife(int[][] board) {
        int[] dx = {0,0,1,1,1,-1,-1,-1};
        int[] dy = {1, -1, 1, -1, 0,0, 1, -1};


        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){

            int count_live = 0;

            for(int i=0; i<8; i++){
                int curr_x = row + dx[i];
                int curr_y = col + dy[i];

                if(isValidNeighbor(curr_x, curr_y, board) && Math.abs(board[curr_x][curr_y])==1){
                    count_live++;
                }

            }
                if( board[row][col] == 1 && (count_live < 2 || count_live > 3)){
                    board[row][col] = -1;
                }

                if( board[row][col] == 0 && (count_live == 3)){
                    board[row][col] = 2;
                }
          

            }
        }

        for(int row=0; row<board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col] >= 1){
                    board[row][col] = 1;
                }else{
                    board[row][col] = 0;
                }
            }
        }
    }
}