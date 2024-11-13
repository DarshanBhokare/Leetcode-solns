class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int number: nums){
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        
        PriorityQueue<Integer> topKFrequencies = new PriorityQueue<>((n1,n2) -> frequencyMap.get(n1) - frequencyMap.get(n2));
        
        for(int key: frequencyMap.keySet()){
            
            topKFrequencies.add(key);
            
            if(topKFrequencies.size() > k){
                topKFrequencies.remove();
            }
            
        }
        
        int[] result = new int[k];
        
        for(int index=0;index<k;index++){
            result[index] = topKFrequencies.remove();
        }
        
        return result;
        
        
        
    }
}