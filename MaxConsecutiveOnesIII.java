class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0;
        int l = 0;
        int window = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zeros++;
            }
            while(zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            window = Math.max(window, r - l + 1);
        }
        return window;
    }
}
