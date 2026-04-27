class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[]res=new String[n];
        
        Integer [] ind=new Integer[n];
        for(int i=0;i<n;i++){
            ind[i]=i;

        }
        Arrays.sort(ind,(a,b) ->score[b]-score[a]);
        for(int i=0;i<n;i++){
            if(i==0){
                res[ind[i]]="Gold Medal";
            }
            else if(i==1){
                res[ind[i]]="Silver Medal";
            }else if(i==2){
                res[ind[i]]="Bronze Medal";
            }
            else{
                res[ind[i]]=String.valueOf(i+1);
            }
        }
        return res;
        
    }
}