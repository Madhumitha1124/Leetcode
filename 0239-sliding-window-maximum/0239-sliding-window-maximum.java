class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> q=new LinkedList<>();
        int[]ans=new int[arr.length-k+1];
        int index=0;
        for(int i=0;i<arr.length;i++){
            while(!q.isEmpty() && q.peekFirst()<=i-k){
                q.pollFirst();
            }
            while(!q.isEmpty() && arr[q.peekLast()]<arr[i]){
                q.pollLast();
            }
            q.offerLast(i);
        
        if(i>=k-1){
            ans[index++]=arr[q.peekFirst()];
        }
        }
        return ans;
        
    }
}