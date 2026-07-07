class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
       int temp=n;
        ArrayList<Integer> ans=new ArrayList<>();
        long r=0;
        int x=0;
        while(temp!=0){
            int num=temp%10;
            if(num!=0){
                 ans.add(0,num);
            }
            temp/=10;
        }
        for(int i=0;i<ans.size();i++){
           x=x*10+ans.get(i);
        }
        int c=x;
        while(c!=0){
            int tem=c%10;
            sum+=tem;
            c/=10;
        }
        return x*sum;
        
        
    }
}