class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int tempProfit = prices[r] - prices[l];
                if (tempProfit > maxProfit) {
                    maxProfit = tempProfit;
                }
                
            } else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}
