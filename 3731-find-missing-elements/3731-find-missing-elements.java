class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        
        }
       
        for(int i=min;i<max;i++){
        boolean isfound=false;
        for(int j=0;j<n;j++){

            if(nums[j]==i){
               isfound=true;
               break;
            }

             
        }
         if(!isfound){
            ans.add(i);
        }

           
        }
       
        Collections.sort(ans);
        return ans;
        
    }
}