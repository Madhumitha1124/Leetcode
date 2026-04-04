class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        
       int index=0;
       for(int n:even) nums[index++]=n;
       for(int n:odd) nums[index++]=n;
       return nums;
    }
}