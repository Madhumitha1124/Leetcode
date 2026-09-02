import java.util.*;

class Solution {
    static final int MOD = 1000000007;

    public int numberWays(List<List<Integer>> hats) {
        int n = hats.size();
        List<Integer>[] hatToPeople = new ArrayList[41];
        for (int i = 1; i <= 40; i++) hatToPeople[i] = new ArrayList<>();

        // Map hats to people
        for (int person = 0; person < n; person++) {
            for (int hat : hats.get(person)) {
                hatToPeople[hat].add(person);
            }
        }

        int maxMask = 1 << n;
        long[] dp = new long[maxMask];
        dp[0] = 1;

        // Iterate over hats
        for (int h = 1; h <= 40; h++) {
            long[] next = Arrays.copyOf(dp, maxMask);
            for (int mask = 0; mask < maxMask; mask++) {
                if (dp[mask] == 0) continue;
                for (int person : hatToPeople[h]) {
                    if ((mask & (1 << person)) == 0) {
                        int newMask = mask | (1 << person);
                        next[newMask] = (next[newMask] + dp[mask]) % MOD;
                    }
                }
            }
            dp = next;
        }

        return (int) dp[maxMask - 1];
    }
}
