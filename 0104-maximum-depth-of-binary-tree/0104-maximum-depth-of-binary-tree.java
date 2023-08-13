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
    int depth;
    public int maxDepth(TreeNode root) {
        // bottom up approach
        if(root==null)
            return 0;
        

        
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
        
    }

}