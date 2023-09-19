class 202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            n = sum(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
        
    }
    public static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            int number = n % 10;
            sum += number * number;
            n /= 10;
        }
        return sum;
    }
}