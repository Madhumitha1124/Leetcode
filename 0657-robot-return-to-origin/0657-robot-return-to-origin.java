class Solution {
    public boolean judgeCircle(String moves) {
        int updown=0;
        int rightleft=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                updown=updown + 1;
            }
             if(moves.charAt(i)=='D'){
                updown=updown - 1;
            }
            if(moves.charAt(i)=='R'){
                rightleft=rightleft + 1;
            }
             if(moves.charAt(i)=='L'){
                rightleft=rightleft - 1;
            }
            
        }
        return rightleft==0 && updown==0;
    }
}