class Solution {
    boolean[][] visited;
    int m,n;
    int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslands(char[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int numberOfIslands=0;
        visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    if(grid[i][j]=='1'){
                        numberOfIslands++;
                        visited[i][j]=true;
                        dfs(i,j,grid);
                    }
                }
            }
        }
        
        return numberOfIslands;
        
        
    }
    
    private void dfs(int i, int j, char[][] grid){
        
        for(int[] direction: directions){
            int nextRow= i + direction[0];
            int nextCol= j + direction[1];
            
            if(isValid(nextRow,nextCol,grid) && !visited[nextRow][nextCol]){
                visited[nextRow][nextCol]=true;
                dfs(nextRow,nextCol,grid);
            }
            
        }
    }
    
    private boolean isValid(int i, int j, char[][] grid){
        return (i>=0 && i<m) && (j>=0 && j<n) && (grid[i][j]=='1');
    }
}