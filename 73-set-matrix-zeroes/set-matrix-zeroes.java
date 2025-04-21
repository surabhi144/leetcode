class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        for(int i = 0; i<m ; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(int i = 0; i<m ; i++){
            for(int j = 0; j<n; j++){
                if(rows.contains(i) || columns.contains(j))
                 matrix[i][j] = 0;
            }
        }
        return;
    }
}