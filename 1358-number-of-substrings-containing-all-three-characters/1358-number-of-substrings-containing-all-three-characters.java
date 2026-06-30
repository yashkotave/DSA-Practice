class Solution {
    public int numberOfSubstrings(String s) {

        int[] freq = new int[3]; // count of a, b, c

        int count = 0;      // final answer
        int curCount = 0;   // how many unique chars (a,b,c) present
        int low = 0;
        int n = s.length();

        for (int high = 0; high < n; high++) {

            char ch = s.charAt(high);

            // Step 1:
            // Add current character into window
            freq[ch - 'a']++;

            // Step 2:
            // If this character came first time in window,
            // increase unique character count
            if (freq[ch - 'a'] == 1) {
                curCount++;
            }

            // Step 3:
            // When window contains a,b,c all together
            while (curCount == 3) {

                // Step 4:
                // Current window is valid.
                // If current window [low..high] is valid,
                // then all substrings ending after high
                // will also be valid.
                count += (n - high);

                // Step 5:
                // Try to make window smaller from left
                char leftChar = s.charAt(low);
                freq[leftChar - 'a']--;

                // Step 6:
                // If any character completely removed,
                // window is no longer valid
                if (freq[leftChar - 'a'] == 0) {
                    curCount--;
                }

                low++;
            }
        }

        return count;
    }
}