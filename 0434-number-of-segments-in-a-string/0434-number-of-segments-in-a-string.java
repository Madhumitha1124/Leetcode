class Solution {
    public int countSegments(String s) {
        int count=0;
        // if(s==" "){
        //     count=0;
        // }
        String [] word=s.split(" ");
        for(char i=0;i<word.length;i++){
            System.out.println(word[i]);
            if(!word[i].isEmpty()){
               count++;
            }
            
        }
        return count;
        
    }
}