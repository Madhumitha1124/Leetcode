class Solution {
    public int getLucky(String s, int k) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            int val=(c-'a')+1;
              s1.append(val);
        }
        String s2=s1.toString();
        int sum=0;
      while(k!=0){
         sum=0;
        for(char c:s2.toCharArray()){
            sum+=c-'0';
         
        }
        s2=String.valueOf(sum);
          k--;
      }
      return sum;
      
       
    }
}