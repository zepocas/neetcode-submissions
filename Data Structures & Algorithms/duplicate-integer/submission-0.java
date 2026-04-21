class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> registry = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (registry.get(nums[i]) != null) return true;
            registry.put(nums[i], true);
        }

        return false;
    }
}