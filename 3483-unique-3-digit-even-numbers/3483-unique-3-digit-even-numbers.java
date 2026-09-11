class Solution {
    public int totalNumbers(int[] digits) {
        ArrayList<Integer> ans=new ArrayList<>();
        int[]freq=new int[digits.length*10];
        for(int i=0;i<digits.length;i++){
            freq[digits[i]]++;
        }
        int a=0;
        int b=0;
        int c=0;
        for (int i=100; i<=999;i+=2){
            a=i/100;
            b=(i%100)/10;
            c=i%10;
            freq[a]-=1;
            freq[b]-=1;
            freq[c]-=1;
            if(freq[a]>=0 && freq[b]>=0 && freq[c]>=0 ){
                ans.add(i);
            }
            freq[a]+=1;
            freq[b]+=1;
            freq[c]+=1;
        }
        return ans.size();

    }
}