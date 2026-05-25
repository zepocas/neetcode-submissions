class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            int distance = x2*x2 + y2*y2;
            heap.offer(new int[]{distance, x2, y2});
        }        

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] curr = heap.poll();
            res[i] = new int[]{curr[1], curr[2]};
        }

        return res;
    }
}
