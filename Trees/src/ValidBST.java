/*
https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/625/
 */
public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return validBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        return (root.val > min && root.val < max && validBST(root.left, min, root.val) && validBST(root.right, root.val, max));
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
