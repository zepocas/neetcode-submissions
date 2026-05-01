class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        res.add(List.of());

        dfs(0, nums, new ArrayList<>());
        
        return res;
    }

    public void dfs(int start, int[] nums, List<Integer> subset) {
        if (start == nums.length) return;

        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            System.out.println("subset = " + subset);
            res.add(new ArrayList<>(subset));
    
            dfs(i + 1, nums, subset);
    
            subset.remove(subset.size() - 1);
        }
    }
}
