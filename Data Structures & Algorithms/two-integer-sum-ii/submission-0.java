class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;

        while (numbers[i] + numbers[j] != target) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        } 
        
        int[] res = new int[2];
        res[0] = i+1;
        res[1] = j+1;

        return res;
    }
}
