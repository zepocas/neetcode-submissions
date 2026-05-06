class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(0, 0, nums, target);
    }

    public int dfs(int i, int sum, int[] nums, int target) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        return dfs(i + 1, sum + nums[i], nums, target) + dfs(i + 1, sum - nums[i], nums, target);
    }
}
