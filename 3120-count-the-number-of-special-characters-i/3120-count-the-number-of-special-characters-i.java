class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(char c:word.toCharArray()){
            set.add(c);

        }
        for(char ch='a';ch<='z';ch++){
        if(set.contains(ch) && set.contains(Character.toUpperCase(ch))  ){
            count++;
        }
        }
        return count;
    }
}