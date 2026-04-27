class KthLargest {

    private PriorityQueue<Integer> q = new PriorityQueue<>();
    private int sizeLimit;

    public KthLargest(int k, int[] nums) {
        sizeLimit = k;

        for (int n : nums) {
            q.offer(n);

            if (q.size() > sizeLimit) {
                q.poll();
            }
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if (q.size() > sizeLimit) q.poll();
        return q.peek();
    }
}
