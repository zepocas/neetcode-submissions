class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int mostFreq = 0;
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            char right = s.charAt(r);
            freq[right - 'A']++;

            mostFreq = Math.max(mostFreq, freq[right - 'A']);

            if ((r - l + 1) - mostFreq > k) {
                char left = s.charAt(l);
                freq[left - 'A']--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
