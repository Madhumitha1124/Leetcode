class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] c = s.toCharArray();

        // already sorted
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (c[i] < c[i - 1]) { sorted = false; break; }
        }
        if (sorted) return 0;

        // length 2 and unsorted: can only sort a single char, so impossible
        if (n == 2) return -1;

        char min = 'z', max = 'a';
        for (char ch : c) {
            if (ch < min) min = ch;
            if (ch > max) max = ch;
        }

        // first char is already the smallest -> sort s[1..]
        // last char is already the largest -> sort s[0..n-2]
        if (c[0] == min || c[n - 1] == max) return 1;

        // first char is the unique largest AND last char is the unique smallest
        int maxCnt = 0, minCnt = 0;
        for (char ch : c) {
            if (ch == max) maxCnt++;
            if (ch == min) minCnt++;
        }
        if (c[0] == max && maxCnt == 1 && c[n - 1] == min && minCnt == 1) return 3;

        return 2;
    }
}