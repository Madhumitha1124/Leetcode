class Solution {
    public  static boolean isVowel(char ch){
        return ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u';
    }
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        int score=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(isVowel(ch)){
                v++;
            }
            else{
                c++;
            }
            }
        }
    
        if(c==0 || v==0) return 0;
        return (int) Math.floor((double)v/c);
        
    }
}