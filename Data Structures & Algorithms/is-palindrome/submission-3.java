class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }
        
        return true;
    }
}
