import java.util.*;

class Solution {
    static final int MOD = 1000000007;
    static final int[] PRIMES = {2,3,5,7,11,13,17,19,23,29};

    public int numberOfGoodSubsets(int[] nums) {
        int[] freq = new int[31];
        for (int num : nums) freq[num]++;

        // Map number to prime mask
        int[] masks = new int[31];
        for (int i = 2; i <= 30; i++) {
            int mask = 0;
            int x = i;
            boolean valid = true;
            for (int j = 0; j < PRIMES.length; j++) {
                int p = PRIMES[j];
                int count = 0;
                while (x % p == 0) {
                    x /= p;
                    count++;
                }
                if (count > 1) {
                    valid = false; // repeated prime factor
                    break;
                }
                if (count == 1) mask |= (1 << j);
            }
            if (valid && x == 1) masks[i] = mask;
        }

        // DP over subsets
        long[] dp = new long[1 << PRIMES.length];
        dp[0] = 1;

        for (int i = 2; i <= 30; i++) {
            if (freq[i] == 0 || masks[i] == 0) continue;
            int mask = masks[i];
            for (int state = (1 << PRIMES.length) - 1; state >= 0; state--) {
                if ((state & mask) == 0) {
                    dp[state | mask] = (dp[state | mask] + dp[state] * freq[i]) % MOD;
                }
            }
        }

        long result = 0;
        for (int state = 1; state < (1 << PRIMES.length); state++) {
            result = (result + dp[state]) % MOD;
        }

        // Handle 1’s separately (they can be included freely)
        long pow1 = 1;
        for (int i = 0; i < freq[1]; i++) {
            pow1 = (pow1 * 2) % MOD;
        }

        return (int)((result * pow1) % MOD);
    }
}
