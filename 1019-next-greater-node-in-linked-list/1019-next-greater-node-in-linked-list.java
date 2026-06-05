/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   
    public int[] nextLargerNodes(ListNode head) {
         ArrayList<Integer> ans=new ArrayList<>();
         while(head!=null){
            ans.add(head.val);
            head=head.next;
         }
         int n=ans.size();
         int [] arr=new int[n];
         Stack<Integer> st=new Stack<>();
         for(int i=0;i<n;i++){
        while(!st.isEmpty() && ans.get(st.peek())<ans.get(i)){
                arr[st.pop()]=ans.get(i);
            }
            st.push(i);
         }
         return arr;
    }
}