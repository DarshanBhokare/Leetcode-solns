class Solution {
    int[][] directions = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    boolean[][] visited;
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        
        
        visited = new boolean[n][n];
        
        if(grid[0][0]==1){
            return -1;
        }
        Queue<int[]> queue= new LinkedList<>();
        
        queue.add(new int[]{0,0,1});
        visited[0][0]=true;
        
        while(!queue.isEmpty()){
            int[] pair = queue.remove();
            int row = pair[0];
            int col = pair[1];
            int steps = pair[2];
            
            if(row== n-1 && col==n-1){
                return steps;
            }

            
            for(int[] direction: directions){
                int rowNew = row + direction[0];
                int colNew = col + direction[1];

                if(isValid(rowNew, colNew, grid,n) && !visited[rowNew][colNew]){

                    visited[rowNew][colNew]=true;
                    //steps+=1;
                    
                    
                    queue.add(new int[]{rowNew,colNew,steps+1});
                    
                                      
                }
            }
            
            
        }
return -1;
    }
    
    public boolean isValid(int row, int col, int[][] grid,int n){
        return (row>=0 && row < n) && ( col >=0 && col < n) && (grid[row][col]==0);
}
}