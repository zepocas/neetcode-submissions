class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freqS = new int[26];
        int[] freqT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int cs = s.charAt(i) - 'a';
            int ct = t.charAt(i) - 'a';

            freqS[cs]++;
            freqT[ct]++;
        }

        String sfreq = Arrays.toString(freqS); 
        String tfreq = Arrays.toString(freqT); 

        return sfreq.equals(tfreq);
    }
}
