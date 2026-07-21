class Solution {
    public int getSum(int a, int b) {
        while (b != 0) { // Continue until there is no carry
            int carry = (a & b) << 1; // Calculate carry
            a = a ^ b; // Sum without carry
            b = carry; // Assign carry to b
        }
        return a; // Final sum
    }
}
