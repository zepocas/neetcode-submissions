class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            minHeap.offer(new int[]{e.getKey(), e.getValue()});
            
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll()[0];
        }

        return res; 
    }
}
