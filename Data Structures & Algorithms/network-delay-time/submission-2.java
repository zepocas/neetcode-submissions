class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> edges = new HashMap<>();

        for (int[] time : times) {
            edges.computeIfAbsent(time[0], key -> new ArrayList<>()).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.offer(new int[]{0, k});

        Set<Integer> visited = new HashSet<>();
        int total = 0;
        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int w1 = curr[0], n1 = curr[1];
            if (visited.contains(n1)) continue;

            visited.add(n1);
            total = w1;
            for (int[] edge : edges.getOrDefault(n1, new ArrayList<>())) {
                minHeap.offer(new int[]{total + edge[1], edge[0]});
            }
        }
        
        return visited.size() == n ? total : -1;
    }
}
