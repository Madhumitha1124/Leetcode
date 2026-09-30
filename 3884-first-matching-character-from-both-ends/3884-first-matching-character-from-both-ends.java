class Solution {
    public int firstMatchingIndex(String s) {
        int count=-1;
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==ch[ch.length-i-1]){
               return i;
            }
        }
        return count;
    }
}