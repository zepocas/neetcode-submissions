class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(0, 0, n, new StringBuilder());
        return res;     
    }

    public void dfs(int nOpen, int nClosed, int n, StringBuilder sb) {
        if (nOpen == n && nOpen == nClosed) {
            res.add(sb.toString());
            return;
        }

        if (nOpen < n) {
            sb.append("(");
            dfs(nOpen + 1, nClosed, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (nClosed < nOpen) {
            sb.append(")");
            dfs(nOpen, nClosed + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}
