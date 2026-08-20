class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       if (s == null || s.length() == 0) {
            return true;
        }

        Set<String> dict = new HashSet<>(wordDict);

        int maxLen =0;
        for(String word : wordDict){
            dict.add(word);
            maxLen = Math.max(word.length(),maxLen);
        }
        int n = s.length();

        // dp[i] represents whether s[0...i-1] can be segmented
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Base case: empty string

        for (int i = 1; i <= n; i++) {
            int minj = Math.max(0,i-maxLen);
            for (int j = i-1; j >= minj; j--) {
                // If s[0...j-1] is valid and s[j...i-1] is in dictionary
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // Move to next i
                }
            }
        }

        return dp[n]; 
    }
}