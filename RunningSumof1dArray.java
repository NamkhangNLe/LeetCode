class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = nums[i] + nums[i-1];
        }
        output arr;
    }
}
