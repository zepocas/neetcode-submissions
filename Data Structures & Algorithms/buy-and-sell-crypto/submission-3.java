class Solution {
    public int maxProfit(int[] prices) {
        int best = 0;
        int min = 101;

        for (int p : prices) {
            min = Math.min(min, p);
            best = Math.max(best, p - min);
        }
        
        return best;
    }
}
