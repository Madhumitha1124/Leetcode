class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
           int n=nums[i];
           sum=0;
           while(n>0){
            int temp=n%10;
            sum+=temp;
            n/=10;
           }
           if(sum==i){
            return i;
           }
        }
        return -1;
    }
}