class NumberOfClosedIslands {
    public int closedIsland(int[][] grid) {
        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0 && dfs(grid, i, j)) {
                    islands++;
                }
            }
        }
        return islands;
    }
    public boolean dfs(int[][] grid, int x, int y) {
        if((x < 0) || (y < 0) || (x >= grid.length) || (y >= grid[0].length)) {
            return false;
        }
        if (grid[x][y] == 1) {
            return true;
        }
        grid[x][y] = 1;
        boolean left = dfs(grid, x + 1, y);
        boolean right = dfs(grid, x - 1, y);
        boolean up = dfs(grid, x, y + 1);
        boolean down = dfs(grid, x, y - 1);
        return left && right && up && down;
    }
}
