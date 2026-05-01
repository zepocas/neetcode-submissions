class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> freqS = new HashMap<>(); 
        Map<Character, Integer> freqT = new HashMap<>(); 
        // int[] freqS = new int[26];
        // int[] freqT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            freqS.put(cs, freqS.getOrDefault(cs, 0) + 1);
            freqT.put(ct, freqT.getOrDefault(ct, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqS.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (!freqT.getOrDefault(key, 0).equals(value)) return false;
        }

        return true;
    }
}
