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
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        ListNode curr=head;
        ListNode prevNode = null, nextNode = null;
        while(curr!=null){
            
            nextNode=curr.next;
            curr.next=prevNode;
            prevNode=curr;
            curr=nextNode;
        }
        
        return prevNode;
        
    }
}