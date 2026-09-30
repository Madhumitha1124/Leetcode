class Solution {
    public boolean digitCount(String num) {
        int[]freq=new int[10];
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            freq[c-'0']++;
        }
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
           if(freq[i]!=(c-'0')){
          return false;
          
           }
           
        }
        
          return true;
        
    }
}