class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=s.length()-1;i>=0;i--){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> p=new PriorityQueue<>(
        //
        (a,b)->map.get(b)-map.get(a)
        );
         p.addAll(map.keySet());
        StringBuilder ans=new StringBuilder();
        while(!p.isEmpty()){
            char curr=p.poll();
            int count=map.get(curr);

        
        for(int i=0;i<count;i++){
          ans.append(curr);
        }
        }
        return ans.toString();
    }
}