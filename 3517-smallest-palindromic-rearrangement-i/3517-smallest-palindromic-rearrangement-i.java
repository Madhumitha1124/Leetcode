class Solution {
    public String smallestPalindrome(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
     
       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

       }
       ArrayList<Character> l=new ArrayList<>(map.keySet());
      Collections.sort(l);
        StringBuilder str=new StringBuilder();
       StringBuilder mid=new StringBuilder();
       for(char c:l){
       // char c=s.charAt(i);
        int count=map.get(c);
        if(count%2==1){
            mid.append(c);
            count--;
        }
       for(int i=0;i<count/2;i++){
        str.append(c);
       }

       }
       String left=str.toString();
       String right=str.reverse().toString();
     //  String middle=mid.toString();
       return left+mid.toString()+right;
    }
}