class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            // char left = s.charAt(l);
            char right = s.charAt(r);

            if (map.containsKey(right)) {
                l = Math.max(map.get(right) + 1, l);
            }

            map.put(right, r);
            res = Math.max(res, r - l + 1);
        } 

        return res;
    }
}
