/*
https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/627/
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return checkSymmetric(root, root);
    }

    private boolean checkSymmetric(TreeNode leftTree, TreeNode rightTree) {
        if (leftTree == null && rightTree == null) {
            return true;
        }
        if (leftTree == null || rightTree == null) {
            return false;
        }

        return leftTree.val == rightTree.val && checkSymmetric(leftTree.left, rightTree.right) && checkSymmetric(leftTree.right, rightTree.left);
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
