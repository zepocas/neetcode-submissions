class KthLargest {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int limit;

    public KthLargest(int k, int[] nums) {
        limit = k;
        for (int n : nums) {
            minHeap.add(n);

            if (minHeap.size() > limit) {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > limit) minHeap.poll();
        
        return minHeap.peek();
    }
}
