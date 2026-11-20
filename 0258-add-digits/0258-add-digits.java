class Solution {
    public int addDigits(int num) {
        int sum=0;
        int r=num%9;
        if(r==0 && num!=0){
            r=9;
        }
        return r;
    }
}