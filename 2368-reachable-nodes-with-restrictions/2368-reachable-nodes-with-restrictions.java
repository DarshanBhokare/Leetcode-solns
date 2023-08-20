class Solution {
    
    
    Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] visited;
    int result;
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        result=1;
        visited = new boolean[n];
        for(int[] edge: edges){
            int x=edge[0],y=edge[1];
            
            if(!graph.containsKey(x)){
                graph.put(x, new ArrayList<>());
            }
            graph.get(x).add(y);
            
            if(!graph.containsKey(y)){
                graph.put(y, new ArrayList<>());
            }
            graph.get(y).add(x);
            
        }
        for(int restrictedNode: restricted){
            visited[restrictedNode]=true;
        }
        
        visited[0]=true;
        dfs(0,edges);        
        return result;
    }
    
    private void dfs(int node, int[][] edges){
        
        for(int neighbor:graph.get(node)){
            if(!visited[neighbor]){
                visited[neighbor]=true;
                result++;
                dfs(neighbor, edges);
            }
        }
    }
}