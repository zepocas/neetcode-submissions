class Solution {
    Map<String, Integer> dp = new HashMap<>();

    public int maxProfit(int[] prices) {
        return dfs(prices, 0, true);
    }

    public int dfs(int[] prices, int i, boolean buying) {
        if (i >= prices.length) return 0;    
        String key = i + ":" + buying;
        if (dp.containsKey(key)) return dp.get(key);

        if (buying) {
            int buy = dfs(prices, i + 1, !buying) - prices[i];
            int hold = dfs(prices, i + 1, buying);
            dp.put(key, Math.max(buy, hold));
        } else {
            int sell = dfs(prices, i + 2, true) + prices[i];
            int hold = dfs(prices, i + 1, buying);
            dp.put(key, Math.max(sell, hold));
        }

        return dp.get(key);
    }
}
