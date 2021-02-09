package assignment2;

/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
class Question1 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode third = head.next.next;
        ListNode second = head.next;
        ListNode first = head;
        second.next = first;
        head = second;
        ListNode newList = swapPairs(third);
        first.next = newList;
        return head;

    }
}
// @lc code=end


