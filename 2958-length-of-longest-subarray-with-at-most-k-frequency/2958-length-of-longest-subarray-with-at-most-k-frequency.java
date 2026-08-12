class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
         HashMap<Integer,Integer> ans=new HashMap<>();
        int left=0;
        int count=0;
       for(int right=0;right<nums.length;right++){
            ans.put(nums[right],ans.getOrDefault(nums[right],0)+1);
            while(ans.get(nums[right])>k){
                ans.put(nums[left],ans.getOrDefault(nums[left],0)-1);
                left++;
            }
            count=Math.max(count,right-left+1);
       }
       return count;
    }
}

        // for(int i=0;i<nums.length;i++){
        //    
        //     for(int j=i;j<nums.length;j++){
        //          ans.put(nums[j],ans.getOrDefault(nums[j],0)+1);
        //           if(ans.get(nums[j])>k){
        //             break;
        //           }
        //            count=Math.max(count,j-i+1);
        //     }
           
        // }
        // return count;