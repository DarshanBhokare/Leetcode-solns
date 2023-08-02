class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int[] answer = new int[nums.length];
        leftProduct[0]=1;
        rightProduct[nums.length-1]=1;
        for(int idx=1;idx<nums.length;idx++){
            leftProduct[idx]=leftProduct[idx-1] * nums[idx-1];
        }
        for(int idx=nums.length-2;idx>=0;idx--){
            rightProduct[idx]=rightProduct[idx+1]*nums[idx+1];
        }
        
        for(int idx=0;idx<nums.length;idx++){
            answer[idx] = leftProduct[idx] * rightProduct[idx];
        }
        return answer;

    }
}