class Solution {
    Map<String, Integer> dp = new HashMap<>();

    public int maxProfit(int[] prices) {
        return dfs(0, prices, true);
    }

    public int dfs(int i, int[] prices, boolean buying) {
        if (i >= prices.length) return 0;

        String key = i + ":" + buying;
        if (dp.containsKey(key)) return dp.get(key);

        int res;
        int cooldown = dfs(i + 1, prices, buying);
        if (buying) {
            int buy = dfs(i + 1, prices, false) - prices[i];
            res = Math.max(buy, cooldown);
        } else {
            int sell = dfs(i + 2, prices, true) + prices[i];
            res = Math.max(sell, cooldown);
        }

        dp.put(key, res);
        return res;
    }
}
