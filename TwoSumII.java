class TwoSumII {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] output = new int[2];
        while (nums[left] + nums[right] != target) {
            if (nums[left] + nums[right] > target) {
               right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                output[0] = left + 1;
                output[1] = right + 1;
                break;
            }
       }
       return output;
    }
}
