class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left=0;
        int right=0;
        int total=0;
       for(int num:nums){
         total+=num;
       }
       int[]res=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        right=total-left-nums[i];
         res[i]=Math.abs(left-right);
         left+=nums[i];
       }
       return res;

      
    }
}