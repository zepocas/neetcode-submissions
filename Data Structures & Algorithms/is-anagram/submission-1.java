class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> freqS = new HashMap<>();
        Map<Character, Integer> freqT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character cS = s.charAt(i);
            Character cT = t.charAt(i);

            if (freqS.containsKey(cS)) {
                freqS.put(cS, freqS.get(cS) + 1);
            } else {
                freqS.put(cS, 1);
            }

            if (freqT.containsKey(cT)) {
                freqT.put(cT, freqT.get(cT) + 1);
            } else {
                freqT.put(cT, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freqS.entrySet()) {
            if (!Objects.equals(freqT.get(entry.getKey()), entry.getValue())) return false;
        }

        return true;
    }
}
