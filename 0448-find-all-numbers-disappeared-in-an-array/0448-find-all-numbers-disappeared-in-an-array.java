class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Set<Integer> see=new HashSet<>();
       // Arrays.sort(nums);
         for(int num:nums){
            see.add(num);
         }
         for(int i=1;i<=nums.length;i++){
            if(!see.contains(i)){
                res.add(i);
            }
         }
         return res;
    }
}