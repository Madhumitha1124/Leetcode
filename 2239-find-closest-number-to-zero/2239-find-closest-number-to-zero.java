class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<min){
                min=nums[i];
                
            }
            if(nums[i]<0 && nums[i]>max){
                max=nums[i];
            }
            if(nums[i]==0){
                  return nums[i];
      }
           
        
          
        
    }
      
     if (min == Integer.MAX_VALUE) return max;
        if (max == Integer.MIN_VALUE) return min;

        if (Math.abs(max) < min) {
            return max;
        } else {
            
            return min;
        }
}
}