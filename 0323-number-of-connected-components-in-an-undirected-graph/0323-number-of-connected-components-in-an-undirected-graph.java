class Solution {
    
    Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] visited;
    int numberOfConnectedComponents;
    public int countComponents(int n, int[][] edges) {
     
        visited = new boolean[n];
        numberOfConnectedComponents=0;
        
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

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i);
                numberOfConnectedComponents++;
            }
        }
        return numberOfConnectedComponents;
    }
    
    private void dfs(int node){
        if(visited[node]){
            return ;
        }
        visited[node]=true;
        if(graph.containsKey(node)){
        for(int neighbor: graph.get(node)){
            
                dfs(neighbor);
        }}
    }
    
}