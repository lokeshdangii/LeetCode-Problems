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

    public List<TreeNode> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return arrToBST(0,list.size()-1);
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }

    public TreeNode arrToBST(int start, int end){
        if(start > end) return null;

        int mid = (start + end)/2;

        TreeNode root = list.get(mid);
        root.left = arrToBST(start,mid-1);
        root.right = arrToBST(mid+1,end);

        return root;
    }
}