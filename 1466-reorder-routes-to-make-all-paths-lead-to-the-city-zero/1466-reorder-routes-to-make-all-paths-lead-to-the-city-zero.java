class Solution {
    
    Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] visited;
    Set<String> roads = new HashSet<>();
    public int minReorder(int n, int[][] connections) {
        
        visited = new boolean[n];
        
        for(int i=0;i<n;i++){
            graph.put(i, new ArrayList<>());
        }
        
        for(int[] connection: connections){
            int x=connection[0];
            int y=connection[1];
            
            graph.get(x).add(y);
            graph.get(y).add(x);
            roads.add(String.valueOf(x) + "," + String.valueOf(y));
            
        }
        
        
        visited[0] = true;
        
        return dfs(0);
        
        
    }
    
    public int dfs(int city){
        int result=0;
        for(int neighbor: graph.get(city)){
            if(!visited[neighbor]){
                if(roads.contains(String.valueOf(city)+","+String.valueOf(neighbor))){
                    result++;
                }
                visited[neighbor]=true;
                result += dfs(neighbor);
            }
        }
        return result;
    }
}