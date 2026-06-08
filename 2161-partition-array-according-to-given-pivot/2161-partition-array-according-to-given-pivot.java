class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        ArrayList<Integer> lans=new ArrayList<>();
        ArrayList<Integer> gans=new ArrayList<>();
        ArrayList<Integer> equal=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                lans.add(arr[i]);
            }
           else  if(arr[i]==pivot){
                equal.add(arr[i]);
            }
            else if(arr[i]>pivot){
                gans.add(arr[i]);
            }
        }
          lans.addAll(equal);
        lans.addAll(gans);
      
        int [] ans=new int[lans.size()];
        for(int i=0;i<lans.size();i++){
              ans[i]=lans.get(i);
        }
        return ans;

    }
}