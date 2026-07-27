class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[]res=new int[2];
        int sum=0;
        for(int i=1;i<n;i++){
            //sum=0;
          for(int j=i;j<n;j++){
            if( i+j==n){
                if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0") ){
               res[0]=i;
               res[1]=j;
               return res;
                }
              
            }
            
          }
        }
        return null;
        
        
    }
}