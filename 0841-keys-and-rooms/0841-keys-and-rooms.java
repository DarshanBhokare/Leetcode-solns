class Solution {
    Set<Integer> visited = new HashSet<>();
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        
        visited.add(0);
        dfs(0, rooms);
        
        return visited.size()== rooms.size();
    }
    
    private void dfs(int room, List<List<Integer>> rooms){
        for(int neighbor: rooms.get(room)){
        if(!visited.contains(neighbor)){
            visited.add(neighbor);
            dfs(neighbor, rooms);
        }
        }
    }
}