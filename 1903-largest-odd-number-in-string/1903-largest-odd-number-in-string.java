class Solution {
    public String largestOddNumber(String num) {
    StringBuilder ans=new StringBuilder();
    int las=-1;
    for(int i=0;i<num.length();i++){
    char c=num.charAt(i);
    ans.append(c);
    int n=c-'0';
    if(n%2==1){
       las=i;
    }
   
   
  
    }
     if(las==-1){
        return "";
    }
        return ans.substring(0,las+1);
    }
}