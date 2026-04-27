class Solution {
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] extended = new int[digits.length + 1];
        extended[0] = 1;

        for (int i = 1; i < extended.length; i++) {
            extended[i] = 0;
        }
        
        return extended;
    }
}
