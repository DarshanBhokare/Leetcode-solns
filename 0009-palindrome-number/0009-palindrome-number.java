class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber =x;
        int reversedNumber = 0;
        
        while(x>0){
            int digit = x%10;
            
            reversedNumber = reversedNumber * 10 + digit;
            x=x/10;
        }
        
       return originalNumber==reversedNumber;
    }
}