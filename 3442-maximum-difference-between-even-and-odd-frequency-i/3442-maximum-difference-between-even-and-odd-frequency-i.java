class Solution {
    public int maxDifference(String s) {
      HashMap<Character,Integer> odd=new HashMap<>();
     // HashMap<Character,Integer> even=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        odd.put(c,odd.getOrDefault(c,0)+1);
        //even.put(c,even.getOrdefault(c,0)+1);
      }
      int maxodd=0;
      int mineven=s.length()-1;
      for(int freq:odd.values()){
        if(freq%2==0){
            mineven=Math.min(freq,mineven);
        }
        else{
            maxodd=Math.max(freq,maxodd);
        }

        
      }
      return maxodd-mineven;
    }
}