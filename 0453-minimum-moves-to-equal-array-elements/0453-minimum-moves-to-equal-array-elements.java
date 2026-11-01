class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int n:nums){
            if(n<min){
                min=n;
            }
            sum=nums.length*min;
            count+=n;
        }
        return count-sum;
    }
}