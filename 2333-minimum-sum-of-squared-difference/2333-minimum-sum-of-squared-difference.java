class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        long k=(long)k1+k2;
        int max=100000;
        int[]count=new int[max+1];
        for(int i=0;i<n;i++){
            count[Math.abs(nums1[i]-nums2[i])]++;
        }
        for(int d=max;d>0 && k>0 ;d--){
            if(count[d]==0) continue;
            if(count[d]<=k){
                k-=count[d];
                count[d-1]+=count[d];
                count[d]=0;
            }
            else{
                count[d]-=k;
                count[d-1]+=k;
                k=0;
            }
        }
        long ans=0;
        for(long i=1;i<=max;i++){
            ans+=count[(int)i]*i *i;
        }
        return ans;
        
    }
}