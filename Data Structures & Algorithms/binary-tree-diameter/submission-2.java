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
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int leftBranch = longestBranch(root.left);
        int rightBranch = longestBranch(root.right);

        return Math.max(max,leftBranch + rightBranch); 
    }

    public int longestBranch(TreeNode node) {
        if (node == null) return 0;

        int leftBranch = longestBranch(node.left);
        int rightBranch = longestBranch(node.right);

        this.max = Math.max(max, leftBranch + rightBranch);
        return Math.max(leftBranch, rightBranch) + 1;
    }
}
