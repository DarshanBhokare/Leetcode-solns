class HitCounter {
    private final int lookback = 300;
    int lifeTimeHits;
    Map<Integer, Integer> timestampHitsMap;
    Stack<Integer> hitsOrder;
    public HitCounter() {
        this.lifeTimeHits=0;
        this.timestampHitsMap=new HashMap<>();
        this.hitsOrder = new Stack<>();
    }
    
    public void hit(int timestamp) {

        timestampHitsMap.put(timestamp,++lifeTimeHits);
        hitsOrder.push(timestamp);
    }
    
    public int getHits(int timestamp) {
        int startTimestamp=timestamp;
        while(!timestampHitsMap.containsKey(timestamp)){
            
            timestamp--;
            if(timestamp==0){
                return 0;
            }
        }

        if(!timestampHitsMap.containsKey(startTimestamp-lookback) && startTimestamp-lookback > 0){
            timestampHitsMap.put(startTimestamp-lookback, lastKnownHit(startTimestamp-lookback));
        }
        
        return timestampHitsMap.get(timestamp) - timestampHitsMap.getOrDefault(startTimestamp-lookback,0);
    }
    
    private int lastKnownHit(int timestamp){
        
        Stack<Integer> tempStack = new Stack<>();

        while(timestamp<=hitsOrder.peek()){
            int num = hitsOrder.pop();
            tempStack.push(num);
            if(hitsOrder.isEmpty()){
                hitsOrder.push(0);
                break;
                    
            }
        }
        
        timestamp = hitsOrder.peek();
        
        while(!tempStack.isEmpty()){
            hitsOrder.push(tempStack.pop());
        }
        return timestampHitsMap.getOrDefault(timestamp,0);
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */