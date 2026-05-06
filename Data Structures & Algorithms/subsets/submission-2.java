class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums, new ArrayList<>());
        return res;
    }

    public void dfs(int i, int[] nums, List<Integer> set) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(set));
            return;
        }
        
        set.add(nums[i]);
        dfs(i + 1, nums, set);
        set.remove(set.size() - 1);
        dfs(i + 1, nums, set);
    }
    
}
