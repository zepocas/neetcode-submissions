class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb = sb.append(s.length() + ":" + s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int iSeparator = str.indexOf(":", i);
            int len = Integer.valueOf(str.substring(i, iSeparator));
            String word = str.substring(iSeparator + 1, iSeparator + 1 + len);
            res.add(word);
            i = iSeparator + 1 + len;
        }

        return res;
    }
}
