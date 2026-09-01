class Solution {
    public boolean isLeapyear(int n){
        return (n%400==0 ) || (n%4==0 && n%100!=0);
    }
    public int dayOfYear(String date) {
        String[]word=date.split("-");
       int year=Integer.parseInt(word[0]);
       int mon=Integer.parseInt(word[1]);
       int day=Integer.parseInt(word[2]);
        int[] daymonth={31,28,31,30,31,30,31,31,30,31,30,31};
       if(isLeapyear(year)){
          daymonth[1]=29;
       }
       int totalday=0;
       for(int i=0;i<mon-1;i++){
        totalday+=daymonth[i];
       }
       totalday+=day;
       return totalday;
       
    }
}