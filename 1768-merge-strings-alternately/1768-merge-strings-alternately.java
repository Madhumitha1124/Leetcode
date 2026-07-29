class Solution {
    public String mergeAlternately(String word1, String word2) {
      int i=0;
      int j=0;
    
      int k=0;
        int m=word1.length() + word2.length();
      char [] w1=word1.toCharArray();
      char[]w2=word2.toCharArray();
      char [] merage=new char[m];
      while(i<word1.length() && j<word2.length()){
       
            merage[k++] =w1[i++];
            merage[k++]=w2[j++];
        
      }
      while(i<word1.length()){
       merage[k++] =w1[i++];
      }
      while(j<word2.length()){
        merage[k++]=w2[j++];
      }
     
      return new String(merage);
    }
}