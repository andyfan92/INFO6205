package assignment2;

class Question4 {


    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        if (root == null) {
            return res;
        }
        int len = 0;
        ListNode cur = root;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        int partLen = len / k;
        int remain = len % k;
        int partCnt = 0;
        cur = root;
        while (cur != null) {
            res[partCnt++] = cur;
            ListNode prev = null;
            if (remain != 0) {
                for (int i = 0; i < partLen + 1; i++) {
                    prev = cur;
                    cur = cur.next;
                }
                if (cur != null) {
                    prev.next = null;
                }
                remain--;

            } else {
                for (int i = 0; i < partLen; i++) {
                    prev = cur;
                    cur = cur.next;
                }
                if (cur != null) {
                    prev.next = null;
                }
            }

        }
        return res;

    }

}

