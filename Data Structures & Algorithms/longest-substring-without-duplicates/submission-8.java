class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, max = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (map.containsKey(c)) {
                l = Math.max(map.get(c) + 1, l);
            }

            map.put(c, r);
            max = Math.max(max, r - l + 1);
        }

        return max; 
    }
}
