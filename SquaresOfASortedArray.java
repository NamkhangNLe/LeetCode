class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] output = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int highestIndex = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                output[highestIndex] = nums[left] * nums[left];
                left++;
            } else {
                output[highestIndex] = nums[right] * nums[right];
                right--;
            }
            highestIndex--;
        }
        return output;
    }
}
