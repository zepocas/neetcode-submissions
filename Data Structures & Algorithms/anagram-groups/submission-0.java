class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        List<int[]> list = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = mapFrequencies(s);
            String sFreq = Arrays.toString(freq);

            if (map.containsKey(sFreq)) {
                map.get(sFreq).add(s);
            } else {
                map.put(sFreq, new ArrayList<>(List.of(s)));
            }
        }

        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            res.add(e.getValue());
        }

        return res;
    }

    private int[] mapFrequencies(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int iChar = c - 'a';
            freq[iChar]++;
        }

        return freq;
    }

}
