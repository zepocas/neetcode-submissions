class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();        

        for (int n : nums) {
            if (!set.add(n)) set.remove(n);
        }

        return new ArrayList<>(set).get(0);
    }
}
