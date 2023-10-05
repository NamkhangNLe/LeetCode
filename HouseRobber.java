class HouseRobber.java {
    public int rob(int[] nums) {
        if (nums.length == 1) { return nums[0]; }
        if (nums.length == 2) { return Math.max(nums[0], nums[1]); }

        int minus2 = 0;
        int minus1 = 0;

        for (int num : nums) {
            int robbed = minus1;
            minus1 = Math.max(minus2 + num, minus1);
            minus2 = robbed;
        }
        return minus1;
    }
}
