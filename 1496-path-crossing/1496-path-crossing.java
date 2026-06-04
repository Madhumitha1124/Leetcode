class Solution {
    public boolean isPathCrossing(String path) {
        // // int hori=0;
        // // int ver=0;
        // int count=0;
        // HashMap<Character,Integer> ans=new HashMap<>();
        //  for(int i=0;i<path.length();i++){
        //     char c=path.charAt(i);
        //     ans.put(c,ans.getOrDefault(c,0)+1);
        //       System.out.println(ans.get(c));
         
        //  if(ans.get(c)>1){
        //     return true;
        //  }
        //  }
        //  return false;
        int x=0;
        int y=0;
     HashSet<String> ans=new HashSet<>();
        ans.add("0,0");
        for(int i=0;i<path.length();i++){
            char c=path.charAt(i);
            if(c=='N') y++;
            else if(c=='S') y--;
            else if(c=='E') x++;
            else if(c=='W')x--;
            String pos=x+","+y;
            if(ans.contains(pos))    return true;
                ans.add(pos);
             
            
        }
       
        return false;
    }
}