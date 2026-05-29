class Solution {
    public int minElement(int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            sum=0;
            while(n!=0){
                int temp=n%10;
                sum+=temp;
                n/=10;
            }
             min=Math.min(min,sum);
        }
       
        return min;
    }
}