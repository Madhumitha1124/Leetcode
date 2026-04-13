class Solution {
    public int[] separateDigits(int[] nums) {
       
        ArrayList<Integer> ans=new ArrayList<>();
         ArrayList<Integer> ans1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             int temp=nums[i];
             while(temp>0){
                  int t=temp%10;
                 ans.add(t);
                  temp/=10;
             }
        
             for(int j=ans.size()-1;j>=0;j--){
                ans1.add(ans.get(j));
             }
             ans.clear();
        }
              int [] res=new int[ans1.size()];
             for(int k=0;k<ans1.size();k++){
                res[k]=ans1.get(k);
             }

             
         return res;
    }
}