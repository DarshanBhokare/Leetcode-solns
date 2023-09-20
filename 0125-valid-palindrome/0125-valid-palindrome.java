class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            
            char leftChar = s.charAt(start);
            char rightChar = s.charAt(end);
            
            if (!isAlphanumeric(leftChar)) {
                start++;
            } else if (!isAlphanumeric(rightChar)) {
                end--;
            } else {
                if (leftChar != rightChar) {
                    return false;
                }
                start++;
                end--;
            }
        }
        
        return true;
    
    }
    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}