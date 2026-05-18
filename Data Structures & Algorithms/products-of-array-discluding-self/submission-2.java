class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];

        int prod = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            prod = prod * nums[i];
            prefix[i] = prod;
        }

        int[] suffix = new int[nums.length];
        prod = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            prod = prod * nums[i];
            suffix[i] = prod;
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = suffix[i + 1];
                continue;
            } else if (i == nums.length - 1) {
                res[i] = prefix[nums.length - 2];
                continue;
            }

            res[i] = prefix[i - 1] * suffix[i + 1];
        }

        return res;
    }
}  
