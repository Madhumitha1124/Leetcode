class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        for(int i=1;i<prices.length;i++){
        int pro=prices[i]-prices[i-1];
        if(pro>0){
            sum+=pro;
        }

        }
        return sum;
        
    }
}