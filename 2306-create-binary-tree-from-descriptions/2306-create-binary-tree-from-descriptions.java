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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> root = new HashSet<>(), child = new HashSet<>();
        Map<Integer, List<int []>> map = new HashMap<>();

        for(int d[] : descriptions){
            child.add(d[1]);
            root.remove(d[1]);

            if(!child.contains(d[0])){
                root.add(d[0]);
            }
            List<int[]> childrens = map.getOrDefault(d[0], new ArrayList<>());
            childrens.add(new int[]{d[1],d[2]});
            map.put(d[0],childrens);
        }
        return solve(root.iterator().next(),map);
    }


    private TreeNode solve(int root, Map<Integer, List<int[]>>map){
        TreeNode node = new TreeNode(root);
        for(int[] c : map.getOrDefault(root,new ArrayList<>())){
            if(c[1] == 1){
                node.left = solve(c[0],map);
            }else{
                node.right = solve(c[0],map);
            }
        }

        return node;
    }
}