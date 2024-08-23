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
        System.out.println("Hit at" + timestamp);
        // timestampHitsMap.put(timestamp,++lifeTimeHits - timestampHitsMap.getOrDefault(timestamp-lookback,0));
        timestampHitsMap.put(timestamp,++lifeTimeHits);
        System.out.println("Hit map after hit " + timestampHitsMap);
        System.out.println("All time hits "+ lifeTimeHits);
        hitsOrder.push(timestamp);
    }
    
    public int getHits(int timestamp) {
        int startTimestamp=timestamp;
        System.out.println("Returning hits at " + timestamp);
        while(!timestampHitsMap.containsKey(timestamp)){
            
            timestamp--;
            if(timestamp==0){
                return 0;
            }
        }
        System.out.println("Updaated timestamp is " + timestamp);

        if(!timestampHitsMap.containsKey(startTimestamp-lookback) && startTimestamp-lookback > 0){
            timestampHitsMap.put(startTimestamp-lookback, lastKnownHit(startTimestamp-lookback));
        }
        System.out.println("Hits at last know timestmap for lookback" + timestampHitsMap.get(startTimestamp-lookback));
                System.out.println("Finally Returning hit for " + timestamp + "From " + timestampHitsMap);
        return timestampHitsMap.get(timestamp) - timestampHitsMap.getOrDefault(startTimestamp-lookback,0);
    }
    
    private int lastKnownHit(int timestamp){
            
            // while(!timestampHitsMap.containsKey(timestamp)){
            //     timestamp--;
            //     if(timestamp==0){
            //         break;
            //     }
            // }
        
        Stack<Integer> tempStack = new Stack<>();
        System.out.println("stack while calculating last known" + hitsOrder);
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
System.out.println("stack after calculating last known" + hitsOrder);
        return timestampHitsMap.getOrDefault(timestamp,0);
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */