import java.util.*;

class Solution {
    public int[] countPairs(int n, int[][] edges, int[] queries) {
        int[] degree = new int[n+1];
        Map<Long, Integer> edgeCount = new HashMap<>();

        // Step 1: Count degrees and edge multiplicities
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            degree[u]++;
            degree[v]++;
            long key = Math.min(u,v) * (long)(n+1) + Math.max(u,v);
            edgeCount.put(key, edgeCount.getOrDefault(key, 0) + 1);
        }

        // Step 2: Sort degrees
        int[] sorted = Arrays.copyOfRange(degree, 1, n+1);
        Arrays.sort(sorted);

        int[] ans = new int[queries.length];

        // Step 3: Answer each query
        for (int qi = 0; qi < queries.length; qi++) {
            int q = queries[qi];
            int total = 0;

            // Two-pointer count of pairs with sum > q
            int left = 0, right = n-1;
            while (left < right) {
                if (sorted[left] + sorted[right] <= q) {
                    left++;
                } else {
                    total += (right - left);
                    right--;
                }
            }

            // Step 4: Adjust for edge overlaps
            for (Map.Entry<Long,Integer> entry : edgeCount.entrySet()) {
                long key = entry.getKey();
                int u = (int)(key / (n+1));
                int v = (int)(key % (n+1));
                int cnt = entry.getValue();

                if (degree[u] + degree[v] > q && degree[u] + degree[v] - cnt <= q) {
                    total--;
                }
            }

            ans[qi] = total;
        }

        return ans;
    }
}
