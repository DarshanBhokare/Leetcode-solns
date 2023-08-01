class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(map.containsKey(val) && map.get(val)!=i){
                result[0]=i;
                result[1]=map.get(val);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}