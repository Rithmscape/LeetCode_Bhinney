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
        ListNode node = new ListNode();
        node.next = head;
        
        ListNode l1 = node;
        ListNode l2 = node;
        
        for (int i = 0; i< n + 1; i++) {
            l1 = l1.next;
        }
        
        while (l1 != null) {
            l1 = l1.next;
            l2 = l2.next;
        }
        
        l2.next = l2.next.next;

        return node.next;
    }
}