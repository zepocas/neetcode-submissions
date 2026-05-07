class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(0, nums, target, new ArrayList<>(), 0);
        return res;
    }

    public void dfs(int i, int[] nums, int target, List<Integer> combination, int sum) {
        if (i >= nums.length) return;
        if (sum > target) return;
        if (sum == target) {
            res.add(new ArrayList<>(combination));
            return;
        }

        sum += nums[i];
        combination.add(nums[i]);
        dfs(i, nums, target, combination, sum);
        sum -= nums[i];
        combination.remove(combination.size() - 1);
        dfs(i + 1, nums, target, combination, sum);
    }
}
