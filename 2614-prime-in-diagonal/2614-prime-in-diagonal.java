class Solution {
    public boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j)==n-1){
                if(isPrime(nums[i][j])){
                    if(nums[i][j]>max){
                        max=nums[i][j];
                    }
                }
            }
            }
        }  
         return max; 
    }
   
}