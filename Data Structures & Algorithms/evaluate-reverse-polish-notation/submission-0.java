class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operators = List.of("+", "-", "*", "/");
        Deque<Integer> stack = new ArrayDeque<>();

        for (String t : tokens) {
            if (operators.contains(t)) {
                int a = stack.pop();
                int b = stack.pop();
                int op = operation(a, b, t);
                stack.push(op);
            } else {
                stack.push(Integer.parseInt(t));
            }
        }

        return stack.pop();
    }

    public int operation(int a, int b, String operator) {
        int res = 0;

        switch (operator) {
            case "+":
                res = b + a;
                break;
            case "-":
                res = b - a;
                break;
            case "*":
                res = b * a;
                break;
            case "/":
                res = b / a;
                break;
        }
        
        return res;
    }
}
