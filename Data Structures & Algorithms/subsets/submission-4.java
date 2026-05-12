class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums, new ArrayList<>());
        
        return res;
    }

    public void dfs(int i, int[] nums, List<Integer> subset) {
        if (!res.contains(subset)) {
            res.add(new ArrayList<>(subset));
        }
        if (i >= nums.length) return;

        subset.add(nums[i]);
        dfs(i + 1, nums, subset);
        subset.remove(subset.size() - 1);
        dfs(i + 1, nums, subset);
    }
}
