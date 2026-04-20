class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int max=n/4;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>max){
                return arr[i];
            }
        }
        return arr[0];

    }
}