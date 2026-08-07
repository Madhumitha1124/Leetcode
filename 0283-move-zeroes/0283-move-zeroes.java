class Solution {
    public void moveZeroes(int[] nums) {
        int idex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idex++]=nums[i];
            }
        }
        while(idex<=nums.length-1){
            nums[idex++]=0;
        }
        
    }
}