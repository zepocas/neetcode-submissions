class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];
            for (Character c : s.toCharArray()) {
                int i = c - 'a';
                freq[i]++;
            }

            String freqS = Arrays.toString(freq);
            map.computeIfAbsent(freqS, k -> new ArrayList<>()).add(s);
        }
        
        List<List<String>> res = new ArrayList<>();
        for (List<String> value : map.values()) {
            res.add(value);
        }

        return res;
    }
}
