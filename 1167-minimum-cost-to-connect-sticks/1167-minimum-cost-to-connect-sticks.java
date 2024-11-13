class Solution {
    public int connectSticks(int[] sticks) {
        
        PriorityQueue<Integer> orderedList = new PriorityQueue<>();
        
        int totalCost = 0;
        
        for(int length: sticks){
            orderedList.add(length);
        }
        
        while(orderedList.size() > 1){
            int firstStick = orderedList.remove();
            int secondStick = orderedList.remove();
            int newStick = firstStick + secondStick;
            orderedList.add(newStick);
            totalCost += newStick;
        }
        
        
        
        return totalCost;
        
    }
}