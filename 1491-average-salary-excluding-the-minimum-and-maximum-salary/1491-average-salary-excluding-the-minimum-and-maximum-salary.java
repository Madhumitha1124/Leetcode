class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        double avg=0;
        double sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int total=0;
         
        for(int n1:salary){
            total+=n1;
        }
         System.out.println(total);
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
                System.out.println(max);
            }
            if(salary[i]<min){
                min=salary[i];
                System.out.println(min);
            }
        }
     int d=max+min;
    
     sum=total-d;
     
     avg=sum/(salary.length-2);
     return avg;
     
    }
}