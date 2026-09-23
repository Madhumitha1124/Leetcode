class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int s=total-x;
        if(s<0) return -1;
        if(s==nums.length) return nums.length;
        int max=-1;

        int left=0;
        int curr=0;
        for(int right=0;right<nums.length;right++){
            curr+=nums[right];
           while(left<=right && curr>s){
            curr-=nums[left];
            left++;
           }
           if(s==curr){
           max=Math.max(max,right-left+1);
           }
        }
        return max== -1 ?-1:nums.length-max;

        
        
    }
}