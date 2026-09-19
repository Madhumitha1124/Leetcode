class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n=arr.length;
       for(int i=0;i+m*k<=n;i++){
        boolean ismatch=true;
        for(int j=i;j<i+m*(k-1);j++){
            if(arr[j]!=arr[j+m]){
                ismatch=false;
               // return false;
            }
        }
        if(ismatch) return true;
       }
       return false;
    }

}