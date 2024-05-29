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
boolean isValidBST(TreeNode root) {
        return isValidBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Utility function to check the BST property with range [min, max]
    boolean isValidBSTUtil(TreeNode node, long min, long max) {
        // An empty tree is a BST
        if (node == null) {
            return true;
        }

        // Check if the current node's value is within the allowed range
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // Recursively check the left and right subtrees with updated ranges
        return isValidBSTUtil(node.left, min, node.val) && isValidBSTUtil(node.right, node.val, max);
    }
}