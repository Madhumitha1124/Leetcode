class Solution {
    public String truncateSentence(String s, int k) {
        String []word=s.trim().split("\\s+");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<k;i++){
            ans.append(word[i]).append(" ");
        }
         return ans.toString().trim();
    }
}