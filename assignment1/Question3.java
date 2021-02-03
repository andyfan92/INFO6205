package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

        List<List<Integer>> findLeaves(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            DFS(root, res);
            return res;
        }

        int DFS(TreeNode root, List<List<Integer>> res) {
            if (root == null) {
                return 0;
            }
            int left = DFS(root.left, res);
            int right = DFS(root.right, res);
            int depth = 1 + Math.max(left, right);
            if (depth >= res.size()) {
                res.add(new ArrayList<>());
            }
            res.get(depth).add(root.val);
            return depth;
        }
}
