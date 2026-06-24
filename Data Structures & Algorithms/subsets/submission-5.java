class Solution {
    
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums, new ArrayList<>());

        return res;
    }

    public void dfs(int i, int[] nums, List<Integer> sub) {
        if (i == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[i]);
        dfs(i + 1, nums, sub);
        sub.remove(sub.size() - 1);
        dfs(i + 1, nums, sub);
    }
}
