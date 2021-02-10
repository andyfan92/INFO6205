package assignment2;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/
class Question5 {
    public Node insert(Node head, int insertVal) {
        Node res = new Node(insertVal);
        if (head == null) {
            res.next = res;
            return res;
        }

        Node cur = head;

        while (cur.next != head) {
            if (cur.val <= insertVal && insertVal <= cur.next.val) {
                break;
            }
            if (cur.val > cur.next.val && (cur.next.val > insertVal || cur.val < insertVal)) {
                break;
            }
            cur = cur.next;
        }

        res.next = cur.next;
        cur.next = res;
        return head;
    }
}