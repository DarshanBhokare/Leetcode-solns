class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> reverseOrderedPiles = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int stones: piles){
            reverseOrderedPiles.add(stones);
        }
        
        while(k>0){
            int pilesToremove = reverseOrderedPiles.remove();
            reverseOrderedPiles.add(pilesToremove - pilesToremove/2);
            k--;
        }
        
        int resultingNumberOfStones=0;
        while(!reverseOrderedPiles.isEmpty()){
            resultingNumberOfStones += reverseOrderedPiles.remove();
        }
        
        return resultingNumberOfStones;
    }
}