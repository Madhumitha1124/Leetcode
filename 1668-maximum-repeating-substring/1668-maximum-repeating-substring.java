class Solution {
    public int maxRepeating(String sequence, String word) {
       int[]dp=new int[sequence.length()+1];
       int n=sequence.length();
       int m=word.length();
    int max=0;
    for(int i=m;i<=sequence.length();i++){
        if(sequence.substring(i-m,i).equals(word)){
            dp[i]=dp[i-m]+1;
              max=Math.max(max,dp[i]);
        }
      
    }
    return max;
    }
}