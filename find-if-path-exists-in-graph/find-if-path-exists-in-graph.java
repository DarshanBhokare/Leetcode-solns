class Solution {
    
    Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] visited;
    boolean result=false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        visited = new boolean[n];
        
        for(int[] edge: edges){
            int x=edge[0];
            int y=edge[1];
            
            if(!graph.containsKey(x)){
                graph.put(x, new ArrayList<>());
            }
            graph.get(x).add(y);
                          
            if(!graph.containsKey(y)){
                graph.put(y, new ArrayList<>());
            }
            graph.get(y).add(x);
        }
        
        if(graph.size()==0){
            return true;
        }
        
        return dfs(source, destination, edges);
        
        
    }
    
    private boolean dfs(int source, int destination, int[][] edges){
        for(int node:graph.get(source)){
            if(!visited[node]){
                visited[node]=true;
                if(node==destination){
                    result= true;
                }
                dfs(node,destination,edges);
            }
        }
        return result;
    }
}