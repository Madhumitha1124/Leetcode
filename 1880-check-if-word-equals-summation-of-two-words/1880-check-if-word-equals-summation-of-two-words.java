class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum=0;
        int a=0;
        int b=0;
        for(int i=0;i<firstWord.length();i++){
            char c=firstWord.charAt(i);
            a=a*10+(int)c-'a';

        }
         for(int i=0;i<secondWord.length();i++){
            char c=secondWord.charAt(i);
            b=b*10+(int)c-'a';

        }
        sum=a+b;
        int c=0;
         for(int i=0;i<targetWord.length();i++){
            char ch=targetWord.charAt(i);
            c=c*10+(int)ch-'a';

        }
       return sum==c || c==a || c==b;

    }
}