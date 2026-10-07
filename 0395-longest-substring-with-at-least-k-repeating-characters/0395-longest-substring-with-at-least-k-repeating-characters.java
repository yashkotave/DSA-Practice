class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        if (n == 0 || n < k) return 0;
        if (k <= 1) return n;
        
        // Count frequencies of all characters
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        // Find the first character that violates the condition (frequency < k)
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (count[c - 'a'] < k) {
                // Split the string at this invalid character and check both halves
                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i + 1), k);
                return Math.max(left, right);
            }
        }
        
        // If no character violated the condition, the entire string is valid
        return n;
    }
}