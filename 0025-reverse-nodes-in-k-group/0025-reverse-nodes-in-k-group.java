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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
    //     int c=0;
    //     for(int i=0;i<k;i++){
    //         if(temp==null) return head;
    //         temp=temp.next;
    //         c++;
    //           System.out.println(c);
    //     }
      
    //     ListNode curr=head;
    //     ListNode prev=null;
    //     ListNode next=null;
      
    //    for(int i=0;i<k;i++){
    //         next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;
          
    //     }
    //     if(next!=null)
    //      head.next= reverseKGroup(next,k);
    //     return prev;
    int c=0;
    while(temp!=null){
        temp=temp.next;
        c++;
    }
    if(c<k) return head;
    int i=0;
    ListNode curr=head;
    ListNode prev=null;
    ListNode next=null;
    while(i<k){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        i++;
    }
    if(next!=null){
        head.next=reverseKGroup(next,k);
       
    }
        return prev; 
    }
}