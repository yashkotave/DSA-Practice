class Solution {
    public boolean isPowerOfFour(int n) {
        // Keep dividing n by 4 while it's divisible
        while (n > 1 && n % 4 == 0) {
            n /= 4;
        }
        // If n becomes 1, it's a power of 4
        return n == 1;
    }
}
