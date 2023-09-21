class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int numberOfSubArrays=0;
        int curr=1;
        int left = 0;
        for(int right =0;right<nums.length;right++){
            curr*=nums[right];
            
            while(curr>=k){
                curr=curr/nums[left];
                left++;
            }
            numberOfSubArrays+=right-left+1;
           
        }
        return numberOfSubArrays;    
    }
}