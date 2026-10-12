class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
      Set<Character> broken=new HashSet<>();
      for(char bro:brokenLetters.toCharArray()){
        broken.add(bro);
      }
      String[]word=text.split(" ");
      int count=0;
      for(String words:word ){
        boolean cantype=true;
        for(char c:words.toCharArray()){
            if(broken.contains(c)){
                cantype=false;
            }
        }
          if(cantype) count++;
      }
    
    return count;
    }
}