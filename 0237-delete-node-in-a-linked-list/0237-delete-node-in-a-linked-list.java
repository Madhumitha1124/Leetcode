/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // ListNode temp=head;
        // int val=node.val;
        // for(int i=0;i<)
       node.val= node.next.val;
       node.next=node.next.next;
        
    }
}