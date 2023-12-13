class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) { return cost[0]; }
        if (cost.length == 2) { return Math.min(cost[0], cost[1]); }
        int[] dp = new int[cost.length];
        dp[0] = cost[0]; // base case 1
        dp[1] = Math.min(cost[0], cost[1]); // base case 2
        for (int i = 2; i < cost.length; i++) {
            dp[i] += Math.min(cost[i], cost[i - 1]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[cost.length - 1];
    }
}
