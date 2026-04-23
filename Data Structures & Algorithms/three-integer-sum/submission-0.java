class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // target = 0
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> candidate = List.of(nums[i], nums[j], nums[k]); 
                        if (!res.contains(candidate)) res.add(candidate);
                        break;
                    }
                }
            }
        }

        return res;
    }
}
