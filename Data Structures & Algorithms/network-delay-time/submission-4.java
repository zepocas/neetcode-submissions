class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> edges = new HashMap<>();

        for (int[] time : times) {
            edges.computeIfAbsent(time[0], key -> new ArrayList<>()).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        minHeap.offer(new int[]{k, 0});

        Set<Integer> visited = new HashSet<>();
        int total = 0;

        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int n1 = curr[0], w1 = curr[1];

            if (visited.contains(n1)) {
                continue;
            }
            visited.add(n1);
            total = w1;

            if (edges.containsKey(n1)) {
                for (int[] edge : edges.get(n1)) {
                    int n2 = edge[0], w2 = edge[1];

                    if (!visited.contains(n2)) {
                        minHeap.offer(new int[]{n2, w1 + w2});
                    }
                }
            }


        }

        return visited.size() == n ? total : -1;
    }
}
