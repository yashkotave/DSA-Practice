class Solution {
    public double myPow(double x, int n) {
        long N = n; // int overflow avoid karne ke liye long liya
        return solve(x, N);
    }

    public double solve(double x, long n) {
        if (n == 0) return 1;

        if (n < 0) {
            return solve(1 / x, -n); // handle negative case
        }

        if (n % 2 == 0) {
            return solve(x * x, n / 2); // if n is even
        }

        return x * solve(x * x, (n - 1) / 2); // if n is odd
    }
}