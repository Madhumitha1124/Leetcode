class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> ra=new LinkedList<>();
        Queue<Integer>dir=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                ra.offer(i);
            }
            else{
                dir.offer(i);
            }
        }
        while(!ra.isEmpty() && !dir.isEmpty()){
            int r=ra.poll();
            int d=dir.poll();
            if(r<d){
                ra.offer(r+n);
            }
            else{
                dir.offer(d+n);
            }
        }
        return ra.isEmpty()?"Dire":"Radiant";
    }
}