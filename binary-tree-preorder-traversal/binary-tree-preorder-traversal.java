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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList();
        Stack<TreeNode> stack= new Stack<TreeNode>();
        System.out.println(root);
        stack.push(root);
        System.out.println(stack.peek());
        
        while(stack.size()>0){
            TreeNode curr=stack.pop();
            if(curr!=null){
                result.add(curr.val);
                stack.push(curr.right);
                stack.push(curr.left);
            }
        }
        return result;
    }
}