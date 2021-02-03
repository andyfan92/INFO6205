package assignment1;



/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
class Question1 {
    final int NO_BLANCE = Integer.MIN_VALUE;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getHeight(root) == NO_BLANCE ? false : true;
    }

    public int getHeight (TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (leftHeight == NO_BLANCE || rightHeight == NO_BLANCE || Math.abs(leftHeight - rightHeight) > 1) {
            return NO_BLANCE;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }


}