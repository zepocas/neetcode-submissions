class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> pairs = Map.of(')', '(', '}', '{', ']', '[');
        Stack<Character> stack = new Stack<>();
        // "([{}])" - iterate through string - is it open bracket or close? - if open then insert in stack
        // if is close then stack.pop must be pair value of the closing bracket

        for (Character c : s.toCharArray()) {
            if (pairs.containsValue(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !pairs.get(c).equals(stack.pop())) {
                return false;
            }           
        }

        return stack.isEmpty();
    }
}
