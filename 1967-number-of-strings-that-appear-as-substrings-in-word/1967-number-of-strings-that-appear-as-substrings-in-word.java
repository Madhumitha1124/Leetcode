class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(char i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}