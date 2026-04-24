class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int []freq=new int[256];
       int lcount=0;
       int rcount=0;
       int max=0;
       int dash=0;
        for(int i=0;i<moves.length();i++){
           char c=moves.charAt(i);
           if(c=='L'){
            lcount++;
           }
           else if(c=='R'){
            rcount++;
           }else{
              dash++;
           }
           max=Math.abs(lcount-rcount)+dash;
        }
        return max;
    }
}