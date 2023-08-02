class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0]=1;
        for(int idx=1;idx<nums.length;idx++){
            answer[idx]=answer[idx-1] * nums[idx-1];
        }
        int rightProduct=1;
        for(int idx=nums.length-1;idx>=0;idx--){
            answer[idx]=answer[idx] * rightProduct;
            rightProduct *= nums[idx];
        }
        return answer;

    }
}