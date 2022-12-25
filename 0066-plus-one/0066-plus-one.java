class Solution {
    public int[] plusOne(int[] digits) {
        // iterate backwards
        for(int i=digits.length-1;i>=0;i--){
            // if digit is 9 then replace it with zero
            if(digits[i]==9){
                digits[i]=0;
            }
            // if digit is not 9, increment it and return the array, which also breaks the loop
            else{
                digits[i]=digits[i]+1;
                return digits;
            }
        }
        // all digits are nine. Re initialise the array and increase the size by 1
        digits =new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}