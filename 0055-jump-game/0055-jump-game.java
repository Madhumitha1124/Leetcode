class Solution {
    public boolean canJump(int[] nums) {
        int stepleft=nums[0];
        for(int i=1;i<nums.length;i++){
            stepleft--;
            if(stepleft<0){
                return false;
            }
            if(i==nums.length-1){
                return true;
            }
            if(stepleft<nums[i]){
                stepleft=nums[i];
            }
        }
        return true;
        
    }
}