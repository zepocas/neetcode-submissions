class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            freq.put(nums[i], freq.get(nums[i]) - 1);
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                freq.put(nums[j], freq.get(nums[j]) - 1);
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int target = -(nums[j] + nums[i]);
                if (freq.containsKey(target) && freq.get(target) > 0) {
                    res.add(List.of(nums[i], nums[j], target));
                }
            }

            for (int j = i + 1; j < nums.length; j++) {
                freq.put(nums[j], freq.get(nums[j]) + 1);
            }
        }
        
        return res;
    }
}
