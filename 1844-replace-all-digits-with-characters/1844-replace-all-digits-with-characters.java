class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                char pre=ans.charAt(ans.length()-1);
                char a= (char)(pre+c-'0');
                ans.append(a);
            }
            else{
            ans.append(c);
            }
        }
        return ans.toString();
    }
}