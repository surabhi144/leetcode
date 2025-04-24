class Solution {
    void swapForTranspose(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    void swapForReverse(int[][] matrix, int i, int j, int n){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n-j-1];
        matrix[i][n-j-1] = temp;
    }

    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                swapForTranspose(matrix, i, j);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n/2; j++){
                swapForReverse(matrix, i, j, n);
            }
        }
    }
}