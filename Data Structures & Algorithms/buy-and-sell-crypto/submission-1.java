class Solution {
    public int maxProfit(int[] prices) {
        int min = 101, max = 0;
        int best = 0;

        for (int n : prices) {
            if (n < min) {
                min = n;
                max = 0;
                continue;
            } 

            if (n > max) {
                max = n;
                best = evaluateBest(min, max, best);
            }
        }
        
        return best;
    }

    public int evaluateBest(int min, int max, int best) {
        int profit = max - min;

        if (profit > best && profit > 0) {
            return profit;
        } else {
            return best;
        }
    }
}
