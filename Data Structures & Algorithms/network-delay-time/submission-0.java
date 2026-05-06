class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> edges = new HashMap<>();

        for (int[] time : times) {
            edges.computeIfAbsent(time[0], key -> new ArrayList<>())
                 .add(new int[] {time[1], time[2]});
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.offer(new int[] {0, k});

        Set<Integer> visited = new HashSet<>();
        int total = 0;
        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int weight1 = curr[0], node1 = curr[1];

            if (visited.contains(node1)) {
                continue;
            }

            visited.add(node1);
            total = weight1;

            for (int[] edge : edges.getOrDefault(node1, Collections.emptyList())) {
                int weight2 = edge[1], node2 = edge[0];
                if (!visited.contains(node2)) {
                    minHeap.offer(new int[] {total + weight2, node2});
                }
            }
        }

        return visited.size() == n ? total : -1;
    }
}
