class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> stoneWeights = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int stoneWeight: stones){
            stoneWeights.add(stoneWeight);
        }
        while(stoneWeights.size()>1){
            int heaviestStone = stoneWeights.remove();
            int secondHeaviestStone = stoneWeights.remove();
            
            if(heaviestStone!=secondHeaviestStone){
                stoneWeights.add(heaviestStone - secondHeaviestStone);
            }
            
        }
        
        return stoneWeights.size() == 0 ? 0 : stoneWeights.peek();
        
    }
}