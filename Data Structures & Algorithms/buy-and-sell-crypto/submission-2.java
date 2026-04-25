class Solution {
    public int maxProfit(int[] prices) {
        int best = 0;
        int min = 101;

        for (int n : prices) {
            best = Math.max(best, n - min);
            min = Math.min(n, min);
        }

        return best;
    }
}
