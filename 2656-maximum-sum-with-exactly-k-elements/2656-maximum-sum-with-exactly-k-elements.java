class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0;
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        while(k>0){
            sum+=max;
            max+=1;
             k--;
        }
       
        return sum;
        
        
    }
}