class Solution {
    int[][] dir = {
        {-1, 0},
        {0, -1},
        {1, 0},
        {0, 1}
    };
    public int orangesRotting(int[][] grid) {
        int mins = 0;
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0;i<m; i++){
            for(int j = 0; j<n;j++){
                if(grid[i][j] == 2)
                 q.add(new int[]{i,j});
                if(grid[i][j] == 1) 
                 fresh++; 
            }
        }
        while(!q.isEmpty()){
            int level = q.size();
            boolean rotted = false;
            for(int i = 0; i<level; i++){
                int[] pair = q.remove();
                int j = pair[0];
                int k = pair[1];
                for(int l = 0; l<dir.length; l++){
                    int nx = j + dir[l][0];
                    int ny = k + dir[l][1];
                    if(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == 1)
                     {
                        grid[nx][ny] = 2;
                        q.add(new int[]{nx, ny});
                        rotted = true;
                        fresh--;
                     }
                }
            }
            if(rotted)
             mins++;
        }
        return fresh == 0 ? mins : -1;
    }
}