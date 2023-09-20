class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxArea = Math.max(maxArea, dfs(grid, i, j));
            }
        }
        return maxArea;
    }
    public int dfs(int[][] matrix, int x, int y) {
        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || matrix[x][y] == 0) {
            return 0;
        }
        matrix[x][y] = 0;
        return (1 + dfs(matrix, x + 1, y) + dfs(matrix, x - 1, y) + dfs(matrix, x, y + 1) + dfs(matrix, x, y - 1));
    }
}
