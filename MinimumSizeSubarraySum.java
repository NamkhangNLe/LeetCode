class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                length = Math.min(right - left + 1, length);
                sum -= nums[left++];
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
