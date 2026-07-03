class Solution {
    public boolean isSubsequence(String s, String t) {
        char[]s1=s.toCharArray();
        char[]s2=t.toCharArray();
        StringBuilder str=new StringBuilder();
        int j=0;
        for(int i=0;i<s1.length;i++){
           while(j<s2.length){
                if(s1[i]==s2[j]){
                    str.append(s2[j]);
                    j++;
                    break;
                }
                 j++;
            }
           
        }
        String s3=str.toString();
        if(s3.equals(s)){
            return true;
        }
        else{
            return false;
        }
        
    }
}