class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();

        res.add(intervals[0]);
        for (int[] interval : intervals) {
            int[] prev = res.get(res.size() - 1);
            int[] curr = interval;
            
            if (prev[1] >= curr[0]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                res.add(interval);
            }
        }

        return res.toArray(new int[res.size()][]); 
    }
}
