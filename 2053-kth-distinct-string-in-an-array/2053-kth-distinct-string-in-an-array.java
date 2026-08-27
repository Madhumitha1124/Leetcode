class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        for(String a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(String n:arr){
            if(map.get(n)==1){
                count++;
            }
            if(count==k){
                return n;
            
            }

        }
        return "";
    }
}