class Solution {
    public boolean canPartition(int[] nums) {
        
        int totalSum = 0;

        // Step 1: Find total sum of array
        for (int num : nums) {
            totalSum += num;
        }

        // If total sum is odd, equal partition is impossible
        if (totalSum % 2 != 0) {
            return false;
        }

        // Step 2: Target sum = half of total sum
        int target = totalSum / 2;

        // dp[i] = true means subset with sum i is possible
        boolean[] dp = new boolean[target + 1];

        // Base case: sum 0 is always possible
        dp[0] = true;

        // Step 3: Process each number
        for (int num : nums) {

            // Traverse backwards to avoid reusing same element
            for (int i = target; i >= num; i--) {

                // If (i - num) was possible before,
                // then i is also possible now
                dp[i] = dp[i] || dp[i - num];
            }
        }

        // Final answer: can we make target sum?
        return dp[target];
    }
}