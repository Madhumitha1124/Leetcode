class Solution {
    public int maxNumberOfBalloons(String text) {
         int [] freq=new int[256];
         
         for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            freq[c]++;
          System.out.println(freq[c]+" "+c);
        
         }
         int b=freq['b'];
         int a=freq['a'];
         int l=freq['l']/2;
         int o=freq['o']/2;
         int n=freq['n'];
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
         
    }
}