class Solution {
    private int countSubarrays(int[] nums, long maxAllowedSum) {
        int subarrays = 1;
        long currentSum = 0;

        for (int x : nums) {
            if (currentSum + x > maxAllowedSum) {
                subarrays++;
                currentSum = x;
            } else {
                currentSum += x;
            }
        }
        return subarrays;
    }

    public int splitArray(int[] nums, int k) {
        long low = 0;
        long high = 0;

        for (int x : nums) {
            low = Math.max(low, (long) x);
            high += x;
        }

        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (countSubarrays(nums, mid) <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }
}