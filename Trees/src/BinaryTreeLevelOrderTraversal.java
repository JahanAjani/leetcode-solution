import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/628/
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> op = new LinkedList<>();
        if (root == null)
            return op;

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> level = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp == null) {
                op.add(level);
                level = new LinkedList<>();
                if (q.isEmpty()) {
                    break;
                }
                q.offer(null);
            } else {
                level.add(temp.val);
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }

        }
        return op;

    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
