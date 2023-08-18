class Solution {
    
    Map<Integer, List<Integer>> graph = new HashMap<>();
    //boolean[] visited;
    Set<Integer> visited= new HashSet<>();
    Set<String> roads = new HashSet<>();
    public int minReorder(int n, int[][] connections) {
        
        //visited = new boolean[n];
        
        for(int i=0;i<n;i++){
            graph.put(i, new ArrayList<>());
        }
        
        for(int[] connection: connections){
            int x=connection[0];
            int y=connection[1];
            
            graph.get(x).add(y);
            graph.get(y).add(x);
            roads.add(convert(x,y));
            
        }
        
        
        //visited[0] = true;
        visited.add(0);
        
        return dfs(0);
        
        
    }
    
    private int dfs(int city){
        int result=0;
        for(int neighbor: graph.get(city)){
            if(!visited.contains(neighbor)){
                if(roads.contains(convert(city, neighbor))){
                    result++;
                }
                //visited[neighbor]=true;
                visited.add(neighbor);
                result += dfs(neighbor);
            }
        }
        return result;
    }
    
    private String convert(int row, int col) {
        return String.valueOf(row) + "," + String.valueOf(col);
    }
    
    
}