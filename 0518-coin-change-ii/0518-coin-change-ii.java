class Solution {
    public int change(int amount, int[] coins) {
        int []dp=new int[amount+1];
        //Arrays.fill(dp,amount+1);
        dp[0]=1;
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                dp[i]=dp[i]+dp[i-coin];
                
            }
        }
        // if(amount==0) {
        // return 1;
        // }
        // if(dp[amount]>amount){
        //     return 0;
        // }
        // else{
        //     return dp[amount];
        // }
        return dp[amount];
        
    }
}