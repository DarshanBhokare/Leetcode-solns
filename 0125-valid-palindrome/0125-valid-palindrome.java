class Solution {
    public boolean isPalindrome(String s) {
        /// Convert the input string to lowercase
        s = s.toLowerCase();
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            // Skip non-alphanumeric characters
            if (!isAlphanumeric(leftChar)) {
                left++;
            } else if (!isAlphanumeric(rightChar)) {
                right--;
            } else {
                // Compare alphanumeric characters
                if (leftChar != rightChar) {
                    return false;
                }
                left++;
                right--;
            }
        }
        
        return true;
    
    }
    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}