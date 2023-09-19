class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int output = Integer.MAX_VALUE;
        int total = 0;
        for (int r = 0; r < nums.length; r++) {
            total += nums[r];
            while (total >= target) {
                output = Math.min(r - l + 1, output);
                total -= nums[l++];
            }
        }
         return output == Integer.MAX_VALUE ? 0 : output;
    }
}
