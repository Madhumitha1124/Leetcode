class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> ans=new HashSet<>();
        int sum=nums[0];
        int i=1;
        while(i<nums.length && nums[i]==nums[i-1]+1){
            sum+=nums[i];
            i++;
        }
        for(int num:nums){
            ans.add(num);
        }
        int x=sum;
        while(ans.contains(x)){
            x++;
        }
        return x;
    }
}