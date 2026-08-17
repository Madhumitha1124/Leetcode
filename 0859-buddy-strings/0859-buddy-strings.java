class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        if(s.equals(goal)){
            int[]count=new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
                if(count[c-'a']>1) return true;
               
            }
             return false;
        }
        int left=-1;
        int right=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                if(left==-1){
                left=i;
                }
                else if(right==-1){
                    right=i;
                }
                else{
                    return false;
                }
            }


           
        }
        return right!=-1 && s.charAt(left)==goal.charAt(right) && s.charAt(right)==goal.charAt(left);
        
    }
}