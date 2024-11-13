class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((n1,n2) -> {
            return getEuclideanDistance(n2[0],n2[1]) - getEuclideanDistance(n1[0],n1[1]);
        });
        
        for(int[] point: points){
            heap.add(point);
            if(heap.size()>k){
                heap.remove();
            }
        }
        
        int[][] result = new int[k][2];
        for(int i=0;i<k;i++){
            result[i] = heap.remove();
        }
        
        
        return result;
        
    }
    
    private int getEuclideanDistance(int x, int y){
        return x*x + y*y;
    }
}