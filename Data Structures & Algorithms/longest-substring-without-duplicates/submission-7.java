class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, res = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char right = s.charAt(r);

            if (map.containsKey(right)) {
                l = Math.max(l, map.get(right) + 1);
            }
            
            map.put(right,r);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
