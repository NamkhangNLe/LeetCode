class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        for (int freq : map.values()) {
            if (freq == maxFreq)
                count += maxFreq;
        }
        return count;
    }
}
