class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(0, 0, n, new StringBuilder());
        return res;
    }

    public void dfs(int open, int closed, int n, StringBuilder sb) {
        if (open == closed && open == n) {
            res.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append("(");
            dfs(open + 1, closed, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        } 

        if (closed < open) {
            sb.append(")");
            dfs(open, closed + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
