class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int temp=n;
        int pro=1;
        boolean hasdigit=false;
        while(temp>0){
            int ti=temp%10;
            pro*=ti;
            temp/=10;
            hasdigit=true;
        }
       if(!hasdigit) pro=0;
     if(pro%t==0){
        return n;
     }
    n++;
        }
     
    
    }
}