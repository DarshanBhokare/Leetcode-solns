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
    public int closestValue(TreeNode root, double target) {
        List<Integer> nums=new ArrayList<>();
        traverse(root,nums);
        
        double minDifference = Integer.MAX_VALUE;
        int result=-1;
        for(int number: nums){
            if(Math.abs(target-number)<minDifference){
                minDifference=Math.abs(target-number);
                result=number;
            }
        }
        return result;
    }
    
    private void traverse(TreeNode root, List<Integer> nums){
        if(root==null) return ;
        traverse(root.left,nums);
        nums.add(root.val);
        traverse(root.right,nums);
    }
}