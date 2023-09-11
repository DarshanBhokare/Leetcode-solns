class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] leftProduct = new int[nums.length];
        
        int[] rightProduct = new int[nums.length];
        leftProduct[0]=1;
        for(int i=1;i<nums.length;i++){
            leftProduct[i]=leftProduct[i-1] * nums[i-1];
        }
        rightProduct[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            rightProduct[i]=rightProduct[i+1]* nums[i+1];
            answer[i]=leftProduct[i] * rightProduct[i];
        }
        answer[nums.length-1]=leftProduct[nums.length-1]*rightProduct[nums.length-1];
        return answer;
    }
}