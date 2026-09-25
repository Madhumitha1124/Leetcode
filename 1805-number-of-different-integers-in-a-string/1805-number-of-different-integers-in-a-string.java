class Solution {
    public int numDifferentIntegers(String word) {
        String ans="";
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isDigit(c)){
                 ans+=c;
            }
            else{
                ans+=" ";
            }
        }
        String[]words=ans.trim().split("\\s+");
        HashSet<String> set=new HashSet<>();
        for(String p:words){
            if(!p.isEmpty()){
                set.add(p.replaceFirst("^0+",""));
            }
        }
        return set.size();


        
    }
}