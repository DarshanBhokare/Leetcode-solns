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
    public int pairSum(ListNode head) {
        // Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        ListNode reverseHead = reverseLinkedList(slow);

        // Calculate the twin sums and find the maximum
        int maxSum = Integer.MIN_VALUE;
        while (head != null && reverseHead != null) {
            maxSum = Math.max(maxSum, head.val + reverseHead.val);
            head = head.next;
            reverseHead = reverseHead.next;
        }

        return maxSum;
        
        
    }
    
    public static ListNode reverseLinkedList(ListNode head) {
    ListNode prevNode = null;
    ListNode currentNode = head;
    ListNode nextNode = null;

    while (currentNode != null) {
        nextNode = currentNode.next; // Save the next node
        currentNode.next = prevNode; // Reverse the link
        prevNode = currentNode; // Move prevNode one step forward
        currentNode = nextNode; // Move currentNode one step forward
    }

    return prevNode; // prevNode will be the new head of the reversed list
}

}