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
        if(root == null)
         return new ArrayList<>();

        List<Integer> rights = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();

        bfs.add(root);
        while(!bfs.isEmpty()){
            int n = bfs.size();
            for(int i = 0; i<n; i++){
                TreeNode curr = bfs.remove();
                if(curr.left != null)
                 bfs.add(curr.left);
                if(curr.right != null)
                 bfs.add(curr.right); 
                if(i == n-1){
                    rights.add(curr.val);
                } 
            }
        }
        return rights;
    }
}