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
class Question4 {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        head = fakeHead;
        while (true) {
            for (int i = 1; i <= m; i++) {
                if (head == null) {
                    break;
                }
                head = head.next;
            }
            if (head == null) {
                break;
            }
            ListNode start = head;
            for (int i = 1; i <= n; i++) {
                if (head == null || head.next == null) {
                    start.next = null;
                    break;
                }
                head = head.next;
            }
            if (head == null) {
                break;
            }
            start.next = head.next;
        }
        return fakeHead.next;

    }
}
