class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int c=i;
            boolean ok=true;
            while(c!=0){
                int temp=c%10;
                if(temp==0 || i%temp!=0) {
                    ok=false;
                    break;
                }
                c/=10;
            }
            if(ok) ans.add(i);
        }
        return ans;
        
    }
}