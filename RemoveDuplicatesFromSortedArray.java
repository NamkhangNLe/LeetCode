class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int nextNonDuplicate = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[nextNonDuplicate - 1]) {
                nums[nextNonDuplicate] = nums[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }
}
