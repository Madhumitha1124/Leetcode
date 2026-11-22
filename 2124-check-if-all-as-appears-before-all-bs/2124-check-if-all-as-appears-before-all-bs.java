class Solution {
    public boolean checkString(String s) {
        char[] s1=s.toCharArray();
         for(int i=0;i<s1.length-1;i++){
             if(s1[i]=='b' && s1[i+1]=='a'){
                return false;
             }
         }
         return true;
    }
}