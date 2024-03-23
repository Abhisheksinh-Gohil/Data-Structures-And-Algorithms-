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

        if(head==null)
            return null;
        ListNode curr = head;
        ListNode nex = head.next;
        ListNode prev = null;

        while(curr != null) {
            nex = curr.next; // Update nex before changing curr.next
            curr.next = prev;
            prev = curr;
            curr = nex;
        }

        return prev;
    }
}