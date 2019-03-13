/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/537/
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return searchPath(root, sum);
    }

    private boolean searchPath(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (sum - root.val == 0 && root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null && root.right == null && sum != 0) {
            return false;
        }
        boolean leftfound = false, rightfound = false;
        leftfound = searchPath(root.left, sum - root.val);
        if (!leftfound) {
            rightfound = searchPath(root.right, sum - root.val);
        }
        if (leftfound || rightfound) {
            return true;
        }
        return false;
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
