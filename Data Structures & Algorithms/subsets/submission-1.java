class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums, new ArrayList<>());
        
        return res;
    }

    public void dfs(int i, int[] nums, List<Integer> subset) {
        if (i >= nums.length) {
            System.out.println("i = " + i);
            System.out.println("guarda subset = " + subset);
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        System.out.printf("adicionou %d ao subset %s %n", nums[i], subset);
        dfs(i + 1, nums, subset);
        subset.remove(subset.size() - 1);
        System.out.printf("removeu %d ao subset %s %n", nums[i], subset);
        dfs(i + 1, nums, subset);
    }
}
