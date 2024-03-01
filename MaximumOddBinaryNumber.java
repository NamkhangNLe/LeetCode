class Solution {
    public String maximumOddBinaryNumber(String s) {
        if (s.length() == 1) { return "1"; }
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        String out = "";
        int zeros = s.length() - ones;
        for (int i = 0; i < ones - 1; i++) {
            out += "1";
        }
        for (int i = 0; i < zeros; i++) {
            out += "0";
        }
        return out + "1";
    }
}
