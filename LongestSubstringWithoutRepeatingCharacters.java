class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) { return 0; }
        HashSet<Character> set = new HashSet<>();
        int output = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l += 1;
            }
            set.add(s.charAt(r));
            output = Math.max(output, r - l + 1);
        }
        return output;
    }
}
