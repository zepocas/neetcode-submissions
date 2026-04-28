class KthLargest {
    
    private PriorityQueue<Integer> q = new PriorityQueue<>();
    private int size;

    public KthLargest(int k, int[] nums) {
        this.size = k;

        for (int n : nums) {
            q.offer(n);
            if (q.size() > size) q.poll();
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if (q.size() > size) q.poll();
        
        return q.peek();
    }
}
