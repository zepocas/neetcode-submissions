class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of('}', '{', ']', '[', ')', '(');
        Deque<Character> stack = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (stack.isEmpty() || map.get(c) != stack.peek()) return false;
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}
