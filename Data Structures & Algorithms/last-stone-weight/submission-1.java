class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int s : stones) {
            heap.offer(s);
        }

        while (heap.size() > 1) {
            int a = heap.poll();
            int b = heap.poll();

            if (a != b) {
                heap.offer(a - b);
            }
        }

        return heap.size() != 0 ? heap.poll() : 0;
    }
}
