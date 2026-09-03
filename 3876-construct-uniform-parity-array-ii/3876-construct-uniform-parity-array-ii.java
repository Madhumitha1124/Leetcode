class Solution {
    public boolean uniformArray(int[] nums1) {

        int min = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int num : nums1) {
            min = Math.min(min, num);

            if (num % 2 == 1) {
                hasOdd = true;
            }
        }

        return min % 2 == 1 || !hasOdd;
    }
}