class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] sig = new int[26];
            
            for (Character c : s.toCharArray()) {
                int i = c - 'a';
                sig[i]++;
            }

            String signature = Arrays.toString(sig);
            List<String> words = map.getOrDefault(signature, new ArrayList<>());
            words.add(s);
            map.put(signature, words);
        }

        List<List<String>> res = new ArrayList<>();

        for (List<String> l : map.values()) {
            res.add(l);
        }

        return res;
    }
}
