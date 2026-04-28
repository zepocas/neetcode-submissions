class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> pairs = Map.of(')', '(', '}', '{', ']', '[');
        Deque<Character> stack = new ArrayDeque<>(); 
        
        for (Character c : s.toCharArray()) {
            if (pairs.keySet().contains(c)) {
                if (stack.isEmpty()) return false;
                if (!stack.pop().equals(pairs.get(c))) return false;
            } else {
                stack.push(c);
            }

        }

        return stack.isEmpty();
    }
}
