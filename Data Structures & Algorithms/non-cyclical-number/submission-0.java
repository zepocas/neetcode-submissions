class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            int number = n;

            while (number > 0) {
                sum += Math.pow(number % 10, 2);
                number = number / 10;
            }

            n = sum;
        }
        
        return n == 1;
    }
}
