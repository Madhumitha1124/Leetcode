class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = findBound(nums, target, true);   // leftmost
        res[1] = findBound(nums, target, false);  // rightmost
        return res;
    }

    private int findBound(int[] nums, int target, boolean isLeft) {
        int left = 0, right = nums.length - 1, bound = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                bound = mid;
                if (isLeft) {
                    right = mid - 1; // keep searching left
                } else {
                    left = mid + 1;  // keep searching right
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return bound;
    }
}
