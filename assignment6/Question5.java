package assignment6;

class Question5 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int cnt = 0;
        while (curr != null && cnt != k) {
            curr = curr.next;
            cnt++;
        }

        if (cnt == k) {
            curr = reverseKGroup(curr, k);
            ListNode tail = curr;
            ListNode curr2 = head;
            while (cnt > 0) {
                ListNode temp =  curr2.next;
                curr2.next = tail;
                tail = curr2;
                curr2 = temp;
                cnt--;
            }
            return tail;
        }
        return head;

    }


}
