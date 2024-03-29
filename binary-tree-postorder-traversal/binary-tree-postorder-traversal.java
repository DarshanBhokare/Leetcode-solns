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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList();
        Stack<TreeNode> stack= new Stack<TreeNode>();
        if(root==null)
            return result;
        stack.push(root);
        while(stack.size()>0){
            TreeNode curr= stack.pop();
            result.add(0,curr.val);
            if(curr.left!=null)
                stack.push(curr.left);
            if(curr.right!=null)
                stack.push(curr.right);
        }
        
        
        return result;
    }
}