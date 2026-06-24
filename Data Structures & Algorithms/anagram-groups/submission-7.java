class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];

            for (Character c : s.toCharArray()) {
                int ch = c - 'a';
                freq[ch]++;
            }

            String sig = Arrays.toString(freq);

            map.computeIfAbsent(sig, k -> new ArrayList<>()).add(s);
        }
        
        
        return new ArrayList<>(map.values());
    }
}
