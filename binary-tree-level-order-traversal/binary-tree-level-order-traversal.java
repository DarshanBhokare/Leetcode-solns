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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null)
            return result;
        queue.add(root);
        
        System.out.println(queue.size());
        int level=0;
        while(queue.size()>0){
            result.add(new ArrayList<Integer>());
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode curr=queue.remove();
                result.get(level).add(curr.val);
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
            level++;
            
        }
        return result;
    }
}