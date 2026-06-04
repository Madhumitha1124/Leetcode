class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ws=0;
        int pro=1;
        int maxlen=0;
        if(k<=1)  return 0;
        for(int we=0;we<nums.length;we++){
               pro*=nums[we];
               while(pro>=k){
                pro/=nums[ws];
                ws++;
               }
               maxlen+=we-ws+1;
        }
        return maxlen;
        
    }
}