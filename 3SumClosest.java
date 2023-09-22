class 3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        // [-4, -1, 1, 2]
        int smallestDifference = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int targetDiff = target - nums[i] - nums[left] - nums[right];
                if (targetDiff == 0) {
                    return target;
                }
                if (Math.abs(targetDiff) < Math.abs(smallestDifference)) {
                    smallestDifference = targetDiff;
                }
                if (targetDiff > 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(target);
        System.out.println(smallestDifference);
        return target - smallestDifference;
    }
}
