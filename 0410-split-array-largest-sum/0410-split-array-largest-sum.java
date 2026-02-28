class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        // Calculate the initial values for start and end
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // Maximum single element
            end += nums[i]; // Sum of all elements
        }

        // Binary search between start and end
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Calculate the number of pieces required for the current mid
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // Start a new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            // Adjust the binary search range
            if (pieces > k) {
                start = mid + 1; // Increase the subarray sum limit
            } else {
                end = mid; // Decrease the subarray sum limit
            }
        }

        return end; // Or start, as they are equal at this point
    }
}
