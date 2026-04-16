class Solution {
    public int mostFrequent(int[] nums, int key) {
        int maxCount = 0;
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1];
                int count = 0;

             
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j] == key && nums[j + 1] == target) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    result = target;
                }
            }
        }

        return result;
    }
}
