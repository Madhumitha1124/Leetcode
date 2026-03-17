class StockSpanner {
  Stack<int[]> ans;
    public StockSpanner() {
        ans=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!ans.isEmpty() && price>=ans.peek()[0]){
            span+=ans.peek()[1];
            ans.pop();
        }
    ans.push(new int[]{price,span});
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */