class MinStack {
    
    private Deque<Integer> stack; 
    private PriorityQueue<Integer> minHeap;

    public MinStack() {
        this.stack = new ArrayDeque<>();  
        this.minHeap = new PriorityQueue<>();
    }
    
    public void push(int val) {
        minHeap.offer(val);
        stack.push(val);
    }
    
    public void pop() {
        int removed = stack.pop();
        minHeap.remove(removed);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minHeap.peek();
    }
}
