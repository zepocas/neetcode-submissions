class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];

            for (int i = 0; i < s.length(); i++) {
                int c = s.charAt(i) - 'a';
                freq[c]++;
            }
            
            String freqS = Arrays.toString(freq);
            map.computeIfAbsent(freqS, key -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
