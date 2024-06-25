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

public static void inorder(Node root){ //left root right
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

 */
class Solution {
    public TreeNode bstToGst(TreeNode root) {
        solve(root,0);
        return root;
    }

    public int solve(TreeNode root, int sum){
        if(root == null) return 0;

        int right = solve(root.right,sum);
        int val = root.val;
        root.val = right + val + sum;
        int left = solve(root.left, root.val);
        
        return right+left + val; 
    }
}