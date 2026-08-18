class Solution {
    public int largestInteger(int[] nums, int k) {
        int []freq=new int[10001];
       
        for(int i=0;i<=nums.length-k;i++){
            boolean []seen=new boolean[10001];
            for(int j=i;j<i+k;j++){
                if(!seen[nums[j]]){
                  freq[nums[j]]++;
                  seen[nums[j]]=true;
                }
                
            }

        }
     int max=-1;
    for(int num:nums){
        if(freq[num]==1){
              max=Math.max(max,num);
            
        }
    }
    return max;
}
}