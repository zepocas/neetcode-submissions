class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        res.add(subset);

        dfs(0, nums, subset);
        
        return res;
    }

    public void dfs(int start, int[] nums, List<Integer> subset) {
        if (start == nums.length) return;

        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            res.add(new ArrayList<>(subset));
    
            dfs(i + 1, nums, subset);
    
            subset.remove(subset.size() - 1);
        }
    }
}

