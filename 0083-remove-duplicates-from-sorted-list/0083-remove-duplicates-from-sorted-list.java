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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
if(head.next==null){
    return head;
}
        HashSet<Integer> set = new HashSet<>();
        
        ListNode slow = head;
        ListNode fast = head.next;
        set.add(slow.val);
        
        while(fast!=null){

            if(set.contains(fast.val)){
                slow.next=fast.next;
            }
            else{
                set.add(fast.val);
                slow=slow.next;
            }
fast=fast.next;
        }
        
        
        return head;
    }
}