class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            int len = s.length();
            sb.append(len);
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) return List.of();

        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int iHash = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, iHash));
            String word = str.substring(iHash + 1, iHash + 1 + len);
            res.add(word);

            i = iHash + 1 + len;
        }

        return res;
    }
}
