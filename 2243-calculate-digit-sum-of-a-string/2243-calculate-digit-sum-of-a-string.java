class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            String sum = "";

            for (int i = 0; i < s.length(); i += k) {

                int res = 0;

                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    res += s.charAt(j) - '0';
                }

                sum += res;
            }

            s = sum;
        }

        return s;
    }
}