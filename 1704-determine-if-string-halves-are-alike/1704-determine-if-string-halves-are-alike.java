class Solution {
    public boolean halvesAreAlike(String s) {
        String a="";
        String b="";
        int n=s.length()/2;
        for(int i=0;i<n;i++){
            a+=s.charAt(i);
            
        }
        for(int j=n;j<s.length();j++){
            b+=s.charAt(j);
        }
        int ac=0;
        int bc=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                ac++;
            }
        }
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                bc++;
            }
        }
      return ac==bc;
        
    }
}