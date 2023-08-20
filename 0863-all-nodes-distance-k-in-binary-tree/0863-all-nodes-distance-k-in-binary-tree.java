/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    Map<Integer, List<Integer>> graph = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        dfsTree(root);
        Queue<Integer> queue = new LinkedList<>();
        int level=0;
        Set<Integer> visited = new HashSet<>();
        
        queue.add(target.val);

        
        while(!queue.isEmpty() && level<k){
            
            int currentLength = queue.size();
            for(int i=0;i<currentLength;i++){
                int node = queue.remove();
                if(!visited.contains(node)){
                    System.out.println(node);
                    visited.add(node);
                    for(int n:graph.get(node)){
                        
                    if(!visited.contains(n)){queue.add(n);}
                    }
                }
            }


            level++;
        }
        while(!queue.isEmpty()){
            result.add(queue.remove());
        }
        
        
        return result;
        
    }
    
    private void dfsTree(TreeNode root){
        
        if(root==null){
            return ;
        }
        if(!graph.containsKey(root.val)){
        graph.put(root.val, new ArrayList<>());
        }
        
        if(root.left!=null){
            graph.get(root.val).add(root.left.val);
            if(!graph.containsKey(root.left.val)){
                graph.put(root.left.val, new ArrayList<>());
            }
            graph.get(root.left.val).add(root.val);
        }
        if(root.right!=null){
            graph.get(root.val).add(root.right.val);
            if(!graph.containsKey(root.right.val)){
                graph.put(root.right.val, new ArrayList<>());
            }
            graph.get(root.right.val).add(root.val);
        }
        
        dfsTree(root.left);
        dfsTree(root.right);
        
    
    }
}