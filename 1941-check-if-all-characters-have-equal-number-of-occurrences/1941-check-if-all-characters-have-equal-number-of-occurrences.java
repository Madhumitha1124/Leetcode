class Solution {
    public boolean areOccurrencesEqual(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
         map.put(c,map.getOrDefault(c,0)+1);
        }
       
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            char n=s.charAt(i+1);
            if(!map.get(c).equals(map.get(n))){
                return false;
            }
           
           
        }
        return true;
        
    }
}