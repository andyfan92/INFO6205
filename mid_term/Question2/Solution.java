package mid_term.Question2;

import java.util.ArrayList;
import java.util.List;

//time complexity O(n) space complexity O(log(n))
public class Solution {
    public void printPerimeter(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null) return;
        res.add(root.val);
        getBounds(root.right, res, false, true);
        getBounds(root.left, res, true, false);

        for (int val : res) {
            System.out.println(val);
        }

    }

    private void getBounds(TreeNode node, List<Integer> res, boolean isLeftBound, boolean isRightBound) {
        if (node == null) return;
        if (isRightBound) {
            res.add(node.val);
        }

        if(!isLeftBound && !isRightBound && node.left == null && node.right == null) {
            res.add(node.val);
        }

        getBounds(node.right, res, isLeftBound && node.left == null, isRightBound);
        getBounds(node.left, res, isLeftBound, isRightBound && node.right == null);

        if (isLeftBound) {
            res.add(node.val);
        }
    }

    public static void main(String[] args) {
        TreeNode fourteen = new TreeNode(14);
        TreeNode thirteen = new TreeNode(13);
        TreeNode twelve = new TreeNode(12);
        TreeNode eleven = new TreeNode(11);
        TreeNode ten = new TreeNode(10);
        TreeNode nine = new TreeNode(9);
        TreeNode eight = new TreeNode(8);
        TreeNode seven = new TreeNode(7, fourteen, null);
        TreeNode six = new TreeNode(6, null, thirteen);
        TreeNode five = new TreeNode(5, ten, eleven);
        TreeNode four = new TreeNode(4, eight, nine);

        TreeNode three = new TreeNode(3, six, seven);
        TreeNode two = new TreeNode(2, four, five);
        TreeNode one = new TreeNode(1, two, three);
        Solution solution = new Solution();
        solution.printPerimeter(one);




    }
}
