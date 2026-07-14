class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int currfast=0;
        int curend=0;
        for(int i=0;i<nums.length-1;i++){
            currfast=Math.max(currfast,i+nums[i]);
               if(i==curend){
                   jump++;
                   curend=currfast;
               }
        }
        return jump;
     
    }
}