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
    List<Integer> values=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        int difference=Integer.MAX_VALUE;
        for(int i=1;i<values.size();i++){
            difference=Math.min(difference, Math.abs(values.get(i)-values.get(i-1)));
        }
        return difference;
    }
    private void dfs(TreeNode root){
        if(root==null){
            return ;
        }
        dfs(root.left);
        values.add(root.val);
        dfs(root.right);
    }
}