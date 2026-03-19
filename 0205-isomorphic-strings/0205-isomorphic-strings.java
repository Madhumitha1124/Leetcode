class Solution {
    public boolean isIsomorphic(String s, String t) {
        char []ch1 =s.toCharArray();
        char[]ch2=t.toCharArray();

        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch1[j] && ch2[i]!=ch2[j]) return false;
                if(ch1[i]!=ch1[j] && ch2[i]==ch2[j]) return false;
            }
        }
        return true;
        
    }
}