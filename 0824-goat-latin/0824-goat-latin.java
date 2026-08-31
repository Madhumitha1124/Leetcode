class Solution {
    public boolean isvowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String toGoatLatin(String sentence) {
        StringBuilder ans = new StringBuilder();
        String[] words = sentence.split(" ");

        for(int i=0; i<words.length; i++){
            String w = words[i];

            if(isvowel(w.charAt(0))){
                ans.append(w);
            } else {
                ans.append(w.substring(1)).append(w.charAt(0));
            }

            ans.append("ma");
            ans.append("a".repeat(i+1));

            if(i < words.length-1) ans.append(" ");
        }
        return ans.toString();
    }
}
