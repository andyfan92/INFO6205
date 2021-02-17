package assignment3;

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
class Question2 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head, right = head,  cur = head;
        int i = 1;
        while (i < k) {
            i++;
            left = left.next;
            cur = cur.next;
        }
        while (cur.next != null) {
            cur = cur.next;
            right =right.next;
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        return head;
    }
}