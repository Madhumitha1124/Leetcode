class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        int diff=0;
        for(int i=Math.max(1,n-k);i<=Math.abs(n+k);i++){
            diff=Math.abs(n-i);
            if(diff<=k && (n&i)==0){
                sum+=i;
            }
        }
        return sum;
        
    }
}