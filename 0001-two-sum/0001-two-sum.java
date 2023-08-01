class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        int slow;
        int fast;
        for(slow =0;slow<nums.length-1;slow++){
            for(fast=slow+1;fast<nums.length;fast++){
                if(nums[slow]+nums[fast]==target){
                    result[0]=slow;
                    result[1]=fast;
                    return result;
                }
                
            }
        }
        return result;
    }
}