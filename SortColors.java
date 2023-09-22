class SortColors {
    public void sortColors(int[] nums) {
        int i = 0;
        int[] buckets = new int[3];
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                buckets[0] += 1;
            } else if (nums[i] == 1) {
                buckets[1] += 1;
            } else {
                buckets[2] += 1;
            }
        }
        i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (buckets[i] != 0) {
                nums[j] = i;
                buckets[i]-= 1;
            } else {
                i++;
                j--;
            }
        }
    }
}
