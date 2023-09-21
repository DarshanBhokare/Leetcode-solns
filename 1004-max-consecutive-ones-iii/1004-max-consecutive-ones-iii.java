class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int curr=0;
        int longest=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                curr++;
            }
            while(curr>k){
                if(nums[left]==0){
                    curr--;
                }
                left++;
            }
            longest=Math.max(longest, right-left+1);
        }
        return longest;
    }
}