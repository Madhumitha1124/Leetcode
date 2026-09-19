class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n=s.length();
        char[]ch=s.toCharArray();
        int count=0;
        int max=-1;
       for(int i=0;i<n;i++ ){
        for(int j=n-1;j>i;j--){
            if(ch[i]==ch[j]){
                count=j-i-1;
                max=Math.max(max,count);
            }
        }
       }
        
        return max;
        
        
    }
}