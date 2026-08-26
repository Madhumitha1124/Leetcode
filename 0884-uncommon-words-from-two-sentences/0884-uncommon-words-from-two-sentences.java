class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map1=new HashMap<>();
       // HashMap<String,Integer> map2=new HashMap<>();
        
        for(String w1:s1.split(" ")){
            map1.put(w1,map1.getOrDefault(w1,0)+1);
        }
        for(String w2:s2.split(" ")){
            map1.put(w2,map1.getOrDefault(w2,0)+1);
        }
       List<String> res=new ArrayList<>();
        for(String ans:map1.keySet()){
            if(map1.get(ans)==1){
                  res.add(ans);
            }

        }
        return res.toArray(new String[0]);
    }
   
}