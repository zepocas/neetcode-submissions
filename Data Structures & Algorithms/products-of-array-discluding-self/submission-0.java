class Solution {
    public int[] productExceptSelf(int[] nums) {
        // interval approach - prefix / suffix
        int[] prefix = new int[nums.length - 1];
        int[] suffix = new int[nums.length];

        int prod = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            prod = prod * nums[i];
            prefix[i] = prod; 
        }

        prod = 1;
        for (int j = nums.length - 1; j > 0; j--) {
            prod = prod * nums[j];
            suffix[j] = prod; 
        }

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int pre, suf;
            if (i == 0) {
                pre = 1;            
            } else {
                pre = prefix[i - 1];
            }

            if (i == nums.length - 1) {
                suf = 1;
            } else {
                suf = suffix[i + 1];
            }

            output[i] = pre*suf;
        }

        return output;
    }
}  
