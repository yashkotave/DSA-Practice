class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // Handle 0 and 1
        
        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid == x) return mid; // Exact match
            if ((long) mid * mid < x) {
                ans = mid; // Record the closest lower square root
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
