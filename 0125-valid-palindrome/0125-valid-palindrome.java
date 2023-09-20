class Solution {
    public boolean isPalindrome(String s) {
        // Convert the input string to lowercase
        s = s.toLowerCase();
        
        // Remove all non-alphanumeric characters using regex
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        
        // Check if the resulting string is a palindrome
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}