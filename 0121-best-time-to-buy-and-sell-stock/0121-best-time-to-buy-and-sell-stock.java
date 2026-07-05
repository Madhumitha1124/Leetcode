class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        int pro=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            pro=prices[i]-min;
            max=Math.max(max,pro);
        }
        return max;
        
    }
}