class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Long, Integer> map = new HashMap<>();
        int n = wall.size();
        for (List<Integer> row : wall) {
            long prefixSum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                prefixSum += row.get(i);
                map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            }
        }
        int maxEdges = 0;
        for (int count : map.values()) {
            maxEdges = Math.max(maxEdges, count);
        }
        return n - maxEdges;
    }
}