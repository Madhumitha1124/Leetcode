class Solution {
    public int superEggDrop(int k, int n) {
        int[][]dp=new int[n+1][k+1];
        int m=0;
        while(dp[m][k]<n){
            m++;
            for(int egg=1;egg<=k;egg++){
                dp[m][egg]=dp[m-1][egg-1]+dp[m-1][egg]+1;
            }
        }
        return m;
        
    }
}