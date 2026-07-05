class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> ans=new LinkedHashSet<>();
        for(int a:nums){
            ans.add(a);
        }
       // int []an=new int[ans.size()];
        int index=0;
        for(int num:ans){
            nums[index++]=num;
             
        }
        return index;
        
    }
}