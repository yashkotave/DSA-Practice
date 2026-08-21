class Solution {
 // Helper predicate function to check feasibility at speed k
    public static boolean canFinish(int[] piles, long h, long k) {
        long totalHours = 0;
        for (int pile : piles) {
            // Integer ceiling division: ceil(pile / k)
            totalHours += (pile + k - 1) / k;
            if (totalHours > h) {
                return false; // Early pruning
            }
        }
        return totalHours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}