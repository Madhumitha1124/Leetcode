class Solution {
    public void rotate(int[] nums, int k) {
        int []res=new int[nums.length];
        int n=nums.length;
        k=k%n;
        for(int i=0;i<n;i++){
            res[i]=nums[(i-k+n)%n];
        }
       for(int i=0;i<res.length;i++){
        nums[i]=res[i];
       }
       //System.out.println();
    }
}