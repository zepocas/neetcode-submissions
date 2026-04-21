class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (Character c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String trunc = sb.toString();
        int len = trunc.length();

        for (int i = 0; i < len; i++) {
            if (trunc.charAt(i) != trunc.charAt(len-i-1)) return false;
        }

        return true;
    }
}
