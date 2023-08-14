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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        int level=0;
        while(!queue.isEmpty()){
            int length=queue.size();
            List<Integer> innerList = new ArrayList<>();
            for(int i=0;i<length;i++){
                
                TreeNode node = queue.remove();
                innerList.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }   
            }
            if(level%2!=0){
                Collections.reverse(innerList);
            }
            result.add(innerList);
            level++;
        }
        return result;
    }
    
}