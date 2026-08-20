class Solution {
    public int minSwaps(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        int n = nums.length;
        int totalOnes = 0;

        // Step 1: Count total number of 1s in the array
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }

        // If no 1s or all 1s, 0 swaps needed
        if (totalOnes <= 1 || totalOnes == n) {
            return 0;
        }

        int k = totalOnes;
        int currentOnes = 0;

        // Step 2: Initialize the first window of size k
        for (int i = 0; i < k; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }

        int maxOnes = currentOnes;

        // Step 3: Slide across the circular array using modulo % n
        for (int i = k; i < 2 * n; i++) {
            // Add incoming element
            if (nums[i % n] == 1) {
                currentOnes++;
            }
            // Remove outgoing element
            if (nums[(i - k) % n] == 1) {
                currentOnes--;
            }

            maxOnes = Math.max(maxOnes, currentOnes);
        }

        return totalOnes - maxOnes;
    }
}