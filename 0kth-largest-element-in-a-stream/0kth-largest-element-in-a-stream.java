class KthLargest {
    
    int k;
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int score: nums){
            heap.add(score);
            maintainHeapSize();
        }
    }
    
    public int add(int val) {
        heap.add(val);
        maintainHeapSize();
        return heap.peek();
    }
    
    private void maintainHeapSize(){
        if(heap.size()>this.k){
                heap.remove();
            }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */