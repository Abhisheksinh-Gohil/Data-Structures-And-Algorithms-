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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode curr = head;
        ListNode prev = new ListNode(0,head);
        ListNode nex = prev;
        
        
        while(n>0 && curr!=null){
            curr = curr.next;
            n-=1;
        }
        
        while(curr!=null){
            nex = nex.next;
            curr = curr.next;
        }
        
        nex.next = nex.next.next;
        
        
        
        return prev.next;
    }
}