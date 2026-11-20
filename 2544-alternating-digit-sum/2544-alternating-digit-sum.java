class Solution {
    public int alternateDigitSum(int n) {
        int rem=n;
        int tempn=n;
        int count=0;
        while(tempn>0){
            tempn=tempn/10;
            count++;
        }
        int i=1;
        if(count%2==0){
            i=-1;
        }
        int sum=0;
       while(count-->0){
        rem=n%10;
         n/=10;
         sum+=(rem*i);
         i*=-1;
       }
       return sum;
    }
}