class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        if (grid.length == 1 && grid[0].length == 1) { 
            return grid[0][0]; 
        }
        dp[0][0] = grid[0][0];
        int runningSum = grid[0][0];
        for (int a = 1; a < grid.length; a++) { 
            dp[a][0] = grid[a][0] + runningSum;
            runningSum = dp[a][0];
        }
        runningSum = grid[0][0];
        for (int b = 1; b < grid[0].length; b++) {
            dp[0][b] = grid[0][b] + runningSum;
            runningSum = dp[0][b];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }
}
