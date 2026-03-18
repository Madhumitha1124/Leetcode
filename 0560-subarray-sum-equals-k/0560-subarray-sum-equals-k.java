class Solution {
    public int subarraySum(int[] nums, int k) {
    //    int currsum=0;
    int count=0;
       for(int i=0;i<nums.length;i++){
        int currsum=0;
        for(int j=i;j<nums.length;j++){
            currsum+=nums[j];
            if(currsum==k){
                count++;
            }
        }
       }
       return count;
        
    
      
    }
}