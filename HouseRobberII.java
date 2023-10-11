class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) { return nums[0]; }
        if (nums.length == 2) { return Math.max(nums[0], nums[1]); }

        return (Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1)));
        
    }
    private int rob(int[] nums, int i, int n) {
        int Nminus2 = 0;
        int Nminus1 = 0;

        for (int j = i; j <= n; j++) {
            int robbed = Nminus1;
            Nminus1 = Math.max(Nminus2 + nums[j], Nminus1);
            Nminus2 = robbed;
        }
        return Nminus1;
    }
}
