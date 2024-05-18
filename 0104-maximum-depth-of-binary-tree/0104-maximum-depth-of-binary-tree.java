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
    
    static int height(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }
    
    public int maxDepth(TreeNode root) {
        return height(root);
    }
}