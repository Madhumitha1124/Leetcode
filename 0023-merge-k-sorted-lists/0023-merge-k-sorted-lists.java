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
    
    public ListNode mergeKLists(ListNode[] lists) {
       PriorityQueue<Integer> min=new PriorityQueue<>();
       for(int i=0;i<lists.length;i++){
        while(lists[i]!=null){
            min.add(lists[i].val);
            lists[i]=lists[i].next;
        }
       }
        ListNode temp=new ListNode();
        ListNode reList=temp;
        while(!min.isEmpty()){
            temp.next=new ListNode(min.poll());
            temp=temp.next;

        }
    
       
          return reList.next;
        
    }
}