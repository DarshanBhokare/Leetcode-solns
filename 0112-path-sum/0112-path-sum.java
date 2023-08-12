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
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target=targetSum;
        return dfs(root, 0);   
    }
    
    private boolean dfs(TreeNode root, int currentValue){
        if(root == null)
            return false;
        if(root.left==null && root.right==null)
            return (currentValue + root.val)==target;
        currentValue += root.val;
        boolean left=dfs(root.left, currentValue);
        boolean right=dfs(root.right, currentValue);
        return left || right;
    }
}