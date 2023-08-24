class Solution {
    
    boolean[][] visited;
    int m,n;
    
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        
        // Add all zeros to the queue and mark them visited.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        
        // Directions for exploring neighbors (up, down, left, right)
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // Start BFS
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0], col = cell[1];
            
            // For each neighboring cell
            for (int[] dir : dirs) {
                int newRow = row + dir[0], newCol = col + dir[1];
                
                // If it's a valid cell and not visited
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    // Set its value to the current cell's value + 1
                    mat[newRow][newCol] = mat[row][col] + 1;
                    queue.offer(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }
        
        return mat;
        
        
    }
    private boolean isValid(int row, int col){
        return row>=0 && row<m && col>=0 && col<n;
    }
}