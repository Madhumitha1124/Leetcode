class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> odd=new ArrayList<>();
         ArrayList<Integer> even=new ArrayList<>();
         int n=nums.length;
        
         for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
            
         }
         Collections.sort(even);
         Collections.sort(odd,Collections.reverseOrder());

         int []res=new int[n];
         int e=0,o=0;
         for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i]=even.get(e++);
            }
            else{
                res[i]=odd.get(o++);
            }
         }
         return res;

    }
}