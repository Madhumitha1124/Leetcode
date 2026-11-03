class Solution {
    public int minMoves(int[] nums) {
        int totalsum=0;
        int targetsum=0;
        int min=Integer.MIN_VALUE;
        for(int n:nums){
            if(n>min){
                min=n;
            }
           
            totalsum+=n;
        }
         targetsum=nums.length*min;
        return targetsum-totalsum;
    }
}