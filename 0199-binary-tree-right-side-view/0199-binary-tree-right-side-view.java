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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();

        solve(root, lst, 0);
        return lst;
        
        
    }

    public void solve(TreeNode root, List<Integer> lst, int level){

        if(root == null){
            return;
        }

        // If this is the first time we're visiting this level, add the node's value
        if (level == lst.size()) {
            lst.add(root.val);
        }

        solve(root.right, lst, level+1);
        solve(root.left, lst, level+1);
    }
}