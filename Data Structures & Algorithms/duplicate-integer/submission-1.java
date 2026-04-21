class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> registry = new HashSet<>();
        
        for (int n : nums) {
            if (!registry.add(n)) return true;
        }

        return false;
    }
}