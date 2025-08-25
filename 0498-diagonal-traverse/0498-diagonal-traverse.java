class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        
        int row = 0, col = 0, idx = 0;
        boolean up = true;

        while (idx < m * n) {
            ans[idx++] = mat[row][col];

            if (up) {
                
                if (col == n - 1) { 
                    row++;
                    up = false;
                } else if (row == 0) { 
                    col++;
                    up = false;
                } else { 
                    row--;
                    col++;
                }
            } else {
                
                if (row == m - 1) { 
                    col++;
                    up = true;
                } else if (col == 0) { 
                    row++;
                    up = true;
                } else { 
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}
