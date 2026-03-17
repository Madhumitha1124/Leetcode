class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ocount=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i] ==1){
                ocount++;
                 max=Math.max(max,ocount);
             }
             else{
             ocount=0;
             }
            
        }
        return max;
    }
}