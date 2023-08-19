class Solution {
    
    boolean[][] visited;
    int[][] directions=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    int maxArea, m, n,area;
    public int maxAreaOfIsland(int[][] grid){ 
        maxArea=0;
        m = grid.length;
        n = grid[0].length;
        
        visited = new boolean[m][n];
        
        for(int i = 0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    visited[i][j]=true;
                    System.out.println("Entering DFS");
                    area=1;
                    dfs(i,j,grid);
                    System.out.println( i + " , " + j + ": "+area);
                    maxArea=Math.max(maxArea, area);
                }
            }
        }        
        
        
        return maxArea;
    }
    
    private boolean isValid(int row, int col, int[][] grid){
        return (row>=0 && row<m) && (col>=0 && col<n) && (grid[row][col]==1);
        
    }
    private void dfs(int row, int col, int[][] grid){
        for(int[] direction: directions){
            int rowNew = row + direction[0], colNew = col + direction[1];
            if(isValid(rowNew, colNew, grid) && !visited[rowNew][colNew]){
                visited[rowNew][colNew]=true;
                area+=1;
                System.out.println(area);
                
                dfs(rowNew, colNew, grid);
                
            }
      
        }
    }
}