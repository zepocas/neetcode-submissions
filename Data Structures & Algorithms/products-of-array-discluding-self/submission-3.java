class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pref = new int[len];
        int[] suff = new int[len];
        int[] res = new int[len];

        pref[0] = 1;
        suff[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            pref[i] = pref[i - 1] * nums[i - 1];
        }

        for (int i = len - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        System.out.println("pref = " + Arrays.toString(pref));
        System.out.println("suff = " + Arrays.toString(suff));

        for (int i = 0; i < len; i++) {
            res[i] = pref[i] * suff[i];
        }

        return res;
    }
}  
