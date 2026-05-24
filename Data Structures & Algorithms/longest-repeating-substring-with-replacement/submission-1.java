class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0, res = 0, maxfreq = 0;

        for (int r = 0; r < s.length(); r++) {
            // registering the plus one for current char
            int right = s.charAt(r) - 'A'; 
            freq[right]++;

            // checking if most frequent char is still the previous or the recently updated
            maxfreq = Math.max(maxfreq, freq[right]);

            while ((r - l + 1) - maxfreq > k) {
                int left = s.charAt(l) - 'A';
                freq[left]--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
