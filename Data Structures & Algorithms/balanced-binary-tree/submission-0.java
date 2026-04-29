/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private boolean balanced = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int left = height(root.left);
        int right = height(root.right);
        balanced = (balanced && Math.abs(left - right) <= 1) ? true : false;

        return balanced;
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        if (!balanced) return 0;

        int left = height(root.left);
        int right = height(root.right);
        
        balanced = (balanced && Math.abs(left - right) <= 1) ? true : false;

        return Math.max(left, right) + 1;
    }
}
