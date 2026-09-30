class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int diff=0;

        char[]ch=s.toCharArray();
        for(int i=1;i<s.length();i++){
             diff=Math.abs(ch[i]-ch[i-1]);
             if(diff>2){
                return false;
             }
             
        }
        return true;
        
    }
}