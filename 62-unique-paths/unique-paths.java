class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int j = 0; j<n; j++)
         grid[m-1][j] = 1;
        for(int i = 0; i<m; i++)
         grid[i][n-1] = 1;

       for(int i = m-2; i>=0 ; i--){
        for(int j = n-2; j>=0 ; j--)
            grid[i][j] = grid[i][j+1] + grid[i+1][j];
        }
        return grid[0][0];
    }   
}