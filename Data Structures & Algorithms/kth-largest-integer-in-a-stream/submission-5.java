class KthLargest {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int max;

    public KthLargest(int k, int[] nums) {
        this.max = k;
        for (int n : nums) {
            minHeap.offer(n);
            if (minHeap.size() > max) {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > max) {
            minHeap.poll();
        }
        
        return minHeap.peek();
    }
}
