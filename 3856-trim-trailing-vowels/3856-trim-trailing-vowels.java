class Solution {
    public boolean isVowel(char c){
          return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public String trimTrailingVowels(String s) {
        StringBuilder str=new StringBuilder();
        boolean trim=true;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if( trim && isVowel(c)){
               // str.append("");
               continue;
            }
            else{
                trim=false;
                str.append(c);
            }
        }
        return str.reverse().toString();
    }
}