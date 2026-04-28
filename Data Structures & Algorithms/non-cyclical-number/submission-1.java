class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        String copy = String.valueOf(n);

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;

            for (int i = 0; i < copy.length(); i++) {
                sum += Math.pow(copy.charAt(i) - '0', 2);
            }

            n = sum;
            copy = String.valueOf(sum);
        }
        
        return n == 1;
    }
}
