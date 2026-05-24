class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2

        // Create a boolean array to mark composites (non-primes)
        boolean[] composites = new boolean[n];
        int limit = (int) Math.sqrt(n); // No need to check factors beyond √n

        for (int i = 2; i <= limit; i++) {
            if (!composites[i]) { // If 'i' is prime
                // Mark all multiples of 'i' as composites starting from i * i
                for (int j = i * i; j < n; j += i) {
                    composites[j] = true;
                }
            }
        }

        // Count the primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!composites[i]) { // If 'i' is not marked as composite
                count++;
            }
        }

        return count;
    }
}
