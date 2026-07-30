class Solution {
    public String removeStars(String s) {
        StringBuilder ans =new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if( c!='*' ){
                ans.append(c);
                
            }
            else{
                if(ans.length()>0){
                    ans.deleteCharAt(ans.length()-1);
                }
            }


        }
        return ans.toString();
    }
}