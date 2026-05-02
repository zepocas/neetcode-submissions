class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        int prod = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            prod = prod * nums[i];     
            prefix[i] = prod;
        }
        
        prod = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            prod = prod * nums[i];     
            suffix[i] = prod;
        }

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                output[i] = suffix[i + 1];
            } else if (i == nums.length - 1 ) {
                output[i] = prefix[i - 1];
            } else{
                output[i] = prefix[i - 1] * suffix[i + 1];
            }
        }
        
        return output;
    }
}  
