package assignment3;

/*
 * @lc app=leetcode id=1669 lang=java
 *
 * [1669] Merge In Between Linked Lists
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        for (int i = 1; i < a; i++) {
            start = start.next;
        }

        ListNode end = start;
        for (int i = a; i <=b; i++) {
            end = end.next;
        }

        start.next = list2;
        ListNode cur = list2;
        ListNode list2End = list2;
        while (cur != null) {
            list2End = cur;
            cur =  cur.next;
        }
        list2End.next = end.next;
        return list1;
    }
}
// @lc code=end

