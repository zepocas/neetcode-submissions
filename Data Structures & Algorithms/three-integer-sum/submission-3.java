class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<List<Integer>> res = new ArrayList<>(); 
        for (int i = 0; i < nums.length - 1; i++) {
            freq.put(nums[i], freq.get(nums[i]) - 1);
            if (i > 0 && nums[i] == nums[i-1]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                freq.put(nums[j], freq.get(nums[j]) - 1);
                if (j > i + 1 && nums[j] == nums[j-1]) continue;

                int diff = -(nums[i] + nums[j]);
                if (freq.getOrDefault(diff, 0) > 0) {
                    res.add(List.of(nums[i], nums[j], diff));
                }
            }

            for (int j = i + 1; j < nums.length; j++) {
                freq.put(nums[j], freq.get(nums[j]) + 1);
            }
        }
        
        return res;
    }
}
