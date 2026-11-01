class Solution {
    public int minimumMoves(String s) {
        int res=0; int l=0;
        while(l<s.length()){
            if(s.charAt(l)=='X'){
                res+=1;
                l+=2;
            }
            l+=1;
        }
        return res;
    }
}