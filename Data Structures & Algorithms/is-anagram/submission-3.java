class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freqS = new HashMap<>();
        Map<Character, Integer> freqT = new HashMap<>();
        
        if (s.length() != t.length()) return false;

        for (Character c : s.toCharArray()) {
            freqS.put(c, freqS.getOrDefault(c, 0) + 1);
        }

        for (Character c : t.toCharArray()) {
            freqT.put(c, freqT.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqS.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (!value.equals(freqT.getOrDefault(key, 0))) return false;
        }

        return true;
    }
}
