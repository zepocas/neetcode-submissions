class Solution {
    int ROWS;
    int COLS;

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        ROWS = grid.length;
        COLS = grid[0].length;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(i, j, grid);
                    max = Math.max(max, area);
                }
            }
        }
        
        return max;
    }

    public int dfs(int i, int j, int[][] grid) {
        if (i < 0 || i >= ROWS || j < 0 || j >= COLS || grid[i][j] != 1) return 0;

        grid[i][j] = 0;
        
        int right = dfs(i+1, j, grid);
        int left = dfs(i-1, j, grid);
        int up = dfs(i, j+1, grid);
        int down = dfs(i, j-1, grid);

        return right + left + up + down + 1; 
    }
}
