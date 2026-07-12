class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        // for(char st:s){
        //     map.put(st,map.getOrDefault(st,0)+1);
        // }
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.get(s.charAt(right))>1){
                char leftc=s.charAt(left);
                map.put(leftc,map.get(leftc)-1);
                left++;
            }
            max=Math.max(max,right-left+1);

        }
        return max;
        
    }
}