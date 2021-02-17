package assignment3;

/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
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
class Question3 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        head = fakeHead;
        while (head != null && head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
                continue;
            }
            head = head.next;
        }
        return fakeHead.next;
    }
}
// @lc code=end


