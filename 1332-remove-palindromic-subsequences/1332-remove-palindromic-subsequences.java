class Solution {
    public int removePalindromeSub(String s) {
        int count=0;
        String ans="";
        String a=s;
        for(int i=s.length()-1;i>=0;i--){
               ans+=s.charAt(i);
        }
        if(ans.equals(a)){
          return 1;
        }
        return 2;
    }
}