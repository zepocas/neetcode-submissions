class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));        

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            int distance = x*x + y*y;

            minHeap.offer(new int[]{x,y,distance});
        }

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] point = minHeap.poll();
            res[i] = new int[]{point[0], point[1]};
        }

        return res;
    }
}
