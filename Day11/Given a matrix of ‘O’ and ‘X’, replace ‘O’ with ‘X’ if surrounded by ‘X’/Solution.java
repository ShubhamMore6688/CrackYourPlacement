

public class Solution {
    public static void markBoundaryConnected(char[][] mat, int i, int j) {
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || mat[i][j] != 'O') {
            return;
        }

        mat[i][j] = '1';  // Temporarily mark this 'O' as '1'

        // Explore all 4 directions
        markBoundaryConnected(mat, i + 1, j);
        markBoundaryConnected(mat, i - 1, j);
        markBoundaryConnected(mat, i, j + 1);
        markBoundaryConnected(mat, i, j - 1);
    }

    public static void replaceMatrix(char[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // Mark all 'O's connected to the boundary
        for (int i = 0; i < m; i++) {
            if (mat[i][0] == 'O') {
                markBoundaryConnected(mat, i, 0);
            }
            if (mat[i][n - 1] == 'O') {
                markBoundaryConnected(mat, i, n - 1);
            }
        }

        for (int j = 0; j < n; j++) {
            if (mat[0][j] == 'O') {
                markBoundaryConnected(mat, 0, j);
            }
            if (mat[m - 1][j] == 'O') {
                markBoundaryConnected(mat, m - 1, j);
            }
        }

        // Replace all remaining 'O's with 'X' and revert '1's back to 'O'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 'O') {
                    mat[i][j] = 'X';
                } else if (mat[i][j] == '1') {
                    mat[i][j] = 'O';
                }
            }
        }
        
    }
    public static void main(String[] args) {
        char[][] mat = {
            {'X', 'O', 'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X', 'O', 'X'},
            {'X', 'X', 'X', 'O', 'O', 'X'},
            {'O', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'O', 'X', 'O'},
            {'O', 'O', 'X', 'O', 'O', 'O'}
        };

        replaceMatrix(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    
    }
}
