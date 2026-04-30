class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length() + "#" + s);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            Integer hashIndex = str.indexOf("#", i);
            int l = Integer.valueOf(str.substring(i, hashIndex));

            StringBuilder sb = new StringBuilder();
            for (int j = hashIndex + 1; j <= hashIndex + l; j++) {
                sb.append(str.charAt(j));
            }

            res.add(sb.toString());
            i = hashIndex + l + 1;
        }

        return res;
    }
}
