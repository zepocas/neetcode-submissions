class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return recursion(nums, 0, 0, target);
    }

    public int recursion(int[] nums, int i, int sum, int target) {
        if (i == nums.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        return recursion(nums, i + 1, sum + nums[i], target) + recursion(nums, i + 1, sum - nums[i], target);
    }
}
