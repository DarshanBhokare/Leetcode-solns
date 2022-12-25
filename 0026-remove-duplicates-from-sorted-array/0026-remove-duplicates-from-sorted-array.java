class Solution {
    public int removeDuplicates(int[] nums) {
        // slow pointer
        int index=1;
        for(int i=1;i<nums.length;i++){
            // skip till duplicated values are found
            // when unique value is found
            // replace duplicate values with new value
            // increment slow pointer
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}