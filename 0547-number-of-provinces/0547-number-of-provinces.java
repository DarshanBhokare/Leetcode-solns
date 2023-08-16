class Solution {
    Map<Integer,List<Integer>> graph = new HashMap<>();
    boolean[] visited;
    public int findCircleNum(int[][] isConnected) {
        int result=0;
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            if(!graph.containsKey(i)){
                graph.put(i,new ArrayList<>());
            }
            for(int j=i+1;j<n;j++){
                if(!graph.containsKey(j)){
                    graph.put(j,new ArrayList<>());
                }
                if(isConnected[i][j]==1){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                visited[i]=true;
                result++;
                dfs(i);
            }
        }
        return result;
        
    }
    private void dfs(int node){
        for(int n: graph.get(node)){
            if(!visited[n]){
                visited[n]=true;
                dfs(n);
            }
        }
    }
}