class Solution {
    public int numberOfSubstrings(String s) {
       int count=0;
       int len=s.length();
       int l=0;
       char[] s1=s.toCharArray();
       String s2=s.substring(0,3);
       int[]freq=new int[s2.length()];
       for(int r=0;r<len;r++){
           freq[s1[r]-'a']++;
       
       while(freq[0]>0 && freq[1]>0 && freq[2]>0){
            
            count+=(len-r);
            freq[s1[l]-'a']--;
       
       l++;
       }
       }
       return count;
          
    }
}