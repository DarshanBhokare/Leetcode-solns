class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int number: nums){
            if(map.containsKey(number)){
                return true;
            }
            map.put(number,1);            
        }
        return false;
    }
}