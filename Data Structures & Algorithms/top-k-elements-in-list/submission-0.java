class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            if (!freq.containsKey(n)) {
                freq.put(n, 1);
            } else {
                freq.put(n, freq.get(n) + 1);
            }
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            List<Integer> bucket = buckets[entry.getValue()];
            if (bucket == null) bucket = new ArrayList<>();
            bucket.add(entry.getKey());
            buckets[entry.getValue()] = bucket;
        }

        int[] res = new int[k];
        int countK = k;
        for (int i = nums.length; i >= 1; i--) {
            if (buckets[i] == null) continue;
            for (Integer n : buckets[i]) {
                if (countK > 0) {
                    res[k-countK] = n;
                    countK--;
                }
            }
        }
        
        return res;
    }
}
