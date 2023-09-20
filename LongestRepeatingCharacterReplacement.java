class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l = 0;
        int mostRepeated = 0;
        int output = 0;
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            mostRepeated = Math.max(mostRepeated, arr[s.charAt(r) - 'A']);
            if (r - l + 1 - mostRepeated > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            output = Math.max(output, r - l + 1);
        }
        return output;
    }
}
