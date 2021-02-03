package assignment1;

public class Question2 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMinDepth = minDepth(root.left);
        int rightMinDepth = minDepth(root.right);

        if (leftMinDepth == 0) {
            return rightMinDepth + 1;
        }

        if (rightMinDepth == 0) {
            return leftMinDepth + 1;
        }

        return 1 + Math.min(leftMinDepth, rightMinDepth);
    }
}
