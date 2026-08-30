class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minindex=0;
        int maxindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxindex=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minindex=i;
            }
           
           
        }
         if(minindex>maxindex){
                int temp=minindex;
                minindex=maxindex;
                maxindex=temp;
            }
          
          int front=maxindex+1;
          int back=nums.length-minindex;
          int mix=(minindex+1)+(nums.length-maxindex);
    
         return Math.min(front,Math.min(back,mix));
        
    }
}