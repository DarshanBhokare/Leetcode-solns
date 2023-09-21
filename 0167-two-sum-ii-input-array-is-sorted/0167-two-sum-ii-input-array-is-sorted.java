class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] resultIndices= new int[2];
        
    int left=0, right=numbers.length-1;
    while(left<right){
        if(numbers[left]+numbers[right]==target){
            resultIndices[0]=left+1;
            resultIndices[1]=right+1;
            return resultIndices;
        }
        else if(numbers[left]+numbers[right]>target){
            right--;
        }
        else{
          left++;  
        }
    }
        return resultIndices;
    }
}