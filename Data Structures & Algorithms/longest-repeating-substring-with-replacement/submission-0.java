class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, res = 0, maxfreq = 0;

        // sliding window, l manually controled an r is incremental
        // update frequency as we go
        // update maxfreq if freq of this r char is the biggest

        // if amount of non majority chars is bigger than k then it's an invalid window
        // we need to decrement the count for l char and shrink the window with l++

        // update res with max between res and current window size

        for (int r = 0; r < s.length(); r++) {
            char right = s.charAt(r);
            char left = s.charAt(l);

            map.put(right, map.getOrDefault(right, 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(right));

            while ((r - l + 1) - maxfreq > k) {
                map.put(left, map.getOrDefault(left, 0) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
