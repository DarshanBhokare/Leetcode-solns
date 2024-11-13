class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> numbers = new PriorityQueue<>(Comparator.reverseOrder());
        double totalArraySum = 0;
        for(int number: nums){
            numbers.add(Double.valueOf(number));
            totalArraySum += number;
        }
        double numbersToReduce = totalArraySum/2;
        
        int numberOfOperations = 0;

        while(numbersToReduce > 0){
            double maxNumber = numbers.remove();
            numbersToReduce -= maxNumber/2;
            numberOfOperations++;
            numbers.add(maxNumber/2);
            
        }
        
        
        return numberOfOperations;
        
    }
}