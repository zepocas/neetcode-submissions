class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        int[] post = new int[len];
        
        int prod = 1;
        for (int i = 0; i < len - 1; i++) {
            prod = nums[i] * prod;
            pre[i] = prod;
        }

        prod = 1;
        for (int i = len - 1; i > 0; i--) {
            prod = nums[i] * prod;
            post[i] = prod;
        }

        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                res[i] = post[i + 1];
            } else if (i == len - 1) {
                res[i] = pre[i - 1];
            } else {
                res[i] = pre[i - 1] * post[i + 1];
            }
        }

        return res;
    }
}  
