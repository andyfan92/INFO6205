package assignment2;

/*
 * @lc app=leetcode id=237 lang=java
 *
 * [237] Delete Node in a Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Question2 {
    public void deleteNode(ListNode node) {
        ListNode prevNode = null;
        ListNode cur = node;
        ListNode nextNode = cur.next;
        while (true) {
            cur.val = nextNode.val;
            prevNode = cur;
            cur = nextNode;
            nextNode = nextNode.next;
            if (nextNode == null) {
                prevNode.next = null;
                break;
            }
        }
    }
}
