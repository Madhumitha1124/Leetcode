class Solution {
    public int mostFrequentEven(int[] nums) {
    //    ArrayList<Integer> ans=new ArrayList<>();
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]%2==0){
    //             ans.add(nums[i]);
    //             System.out.println( "ans:"+   ans.add(nums[i]));
    //         }
    //     }
    //     int []freq=new int[256];
    //     for(int i=0;i<ans.size();i++){
    //           if(ans.get(i)%2==0){
    //             freq[ans.get(i)]++;
    //             System.out.println( "fre:"+  freq[ans.get(i)]++);
    //           }
    //     }
    //     int min=-1;

    //     ArrayList<Integer> d=new ArrayList<>();
    //     for(int i=0;i<ans.size();i++){
    //         if(freq[ans.get(i)]>1 ){
    //              d.add(ans.get(i));
    //              System.out.println( "d:"+  d.add(ans.get(i)));
    //         }
    //     }
    //     for(int i=0;i<d.size();i++){
    //         if(d.get(i)>min){
    //             min=d.get(i);
    //             System.out.println("min:"+min);
    //         }
    //     }
    //     return min;
    int []freq=new int[100001];
    int max=0;
    int res=-1;
    for(int num:nums){
        if(num%2==0){
            freq[num]++;
            if(freq[num]>max || freq[num]==max && num<res){
                max=freq[num];
                res=num;
            }
        }
    }
    return res;
    }
}