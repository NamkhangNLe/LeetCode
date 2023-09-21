class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                length = Math.min(length, r - l + 1);
                sum -= nums[l++];
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
