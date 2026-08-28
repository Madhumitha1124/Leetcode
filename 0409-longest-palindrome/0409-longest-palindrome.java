class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character, Integer> ans=new HashMap<>();
       int len=0;
       boolean found=false;
       for(int right=0;right<s.length();right++){
        char c=s.charAt(right);
        ans.put(c,ans.getOrDefault(c,0)+1);
       }
        for(int n:ans.values()){
            len+=(n/2)*2;
        
        if(n%2==1){
            found=true;
        }
        }
        if(found) len+=1;
        return len;
    }
}