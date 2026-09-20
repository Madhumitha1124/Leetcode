class Solution {
    public int reverseDegree(String s) {
       
        int rev1=0;
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
          int rev=26-(c-'a');
          int pos=i+1;
          rev1+=rev*pos;

       }
      
        return rev1;
        
    }
}