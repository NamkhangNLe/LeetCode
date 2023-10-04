class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) { return 1;}
        if (n == 2) { return 2;}
        int minus2 = 1;
        int minus1 = 2;
        int ways = 0;
        for (int i = 2; i < n; i++) {
            ways = minus1 + minus2;
            minus2 = minus1;
            minus1 = ways;
        }
        return ways;
    }
}
