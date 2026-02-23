class Solution {

    public int fun(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += d * d;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (true) {
            slow = fun(slow);              // move 1 step
            fast = fun(fun(fast));         // move 2 steps

            if (fast == 1) return true;    // reached 1 → happy
            if (slow == fast) return false; // cycle detected
        }
    }
}