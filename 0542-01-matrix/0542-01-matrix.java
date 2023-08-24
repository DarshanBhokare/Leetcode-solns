class Solution {
    
    boolean[][] visited;
    int m,n;
    
    public int[][] updateMatrix(int[][] mat) {
        m=mat.length;
        
        n=mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        visited= new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    visited[i][j]=true;
                    queue.add(new int[]{i,j});
                }
            }
        }
        
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        
        while(!queue.isEmpty()){
            
            int[] pair = queue.remove();
            int x = pair[0], y=pair[1];

            for(int[] direction: directions){
                int row=x+direction[0], col=y+direction[1];
                
                if(isValid(row,col) && !visited[row][col]){
                   visited[row][col]=true;
                    mat[row][col]=mat[x][y]+1;
                    queue.add(new int[]{row,col});
                }
                
            }
            
        }
        return mat;
        
        
        
    }
    private boolean isValid(int row, int col){
        return row>=0 && row<m && col>=0 && col<n;
    }
}