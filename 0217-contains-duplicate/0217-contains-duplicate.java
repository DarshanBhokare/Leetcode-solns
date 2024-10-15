class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // set
        Set<Integer> setOfNumbers = new HashSet<>();
        
        for(int number: nums){
            if(setOfNumbers.contains(number)){
                return true;
            }
            setOfNumbers.add(number);
        }
        
        return false;
    }
}