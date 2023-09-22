class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int totalIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    totalIslands++;
                }
            }
        }
        return totalIslands;
    }
    public void dfs(char[][] matrix, int x, int y) {
        if(x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || matrix[x][y] == '0') {
            return;
        }
        matrix[x][y] = '0';
        dfs(matrix, x + 1, y);
        dfs(matrix, x - 1, y);
        dfs(matrix, x, y + 1);
        dfs(matrix, x, y - 1);
    }
}
