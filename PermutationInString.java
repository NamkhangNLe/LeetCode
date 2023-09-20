class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int length = s1.length();
        int i = 0;
        for (i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int[] perm = new int[26];
        for (i = 0; i < s2.length(); i++) {
            perm[s2.charAt(i) - 'a']++;
            if (i >= length) {
                perm[s2.charAt(i - length) - 'a']--;
            }
            if (Arrays.equals(freq, perm))
                return true;
        }
        return false;
    }
}
