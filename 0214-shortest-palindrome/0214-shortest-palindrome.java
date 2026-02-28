public class Solution {
    public String shortestPalindrome(String s) {
        // If the string is empty or only has one character, it's already a palindrome
        if (s == null || s.length() <= 1) {
            return s;
        }
        
        // Reverse the string
        String rev = new StringBuilder(s).reverse().toString();
        
        // Try finding the longest palindromic prefix
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(0, s.length() - i).equals(rev.substring(i))) {
                // Append the remaining part of the reversed string to the front
                return rev.substring(0, i) + s;
            }
        }
        
        return rev + s; // In case no palindrome is found, return the string reversed plus original
    }
}
