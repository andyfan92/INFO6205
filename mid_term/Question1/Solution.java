package mid_term.Question1;


//time complexity O(len(n) * len(m)) space complexity O(1)
public class Solution {
    public boolean areConverging(ListNode n1, ListNode n2){
        ListNode p1 = n1;
        ListNode p2 = n2;
        if (p1 == null || p2 == null) {
            return false;
        }
        while (p1 != p2) {
            p1 = (p1 == null ? n2 : p1.next);
            p2 = (p2 == null ? n1 : p2.next);
            if (p1 == n1 && p2 == n2 ) {
                return false;
            }
        }
        return p1 != null;

    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(3, null);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);


        Solution solution = new Solution();
        System.out.println(solution.areConverging(l4, l1));

    }
}
