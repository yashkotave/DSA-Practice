import java.util.Arrays;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        // Get the sorted digit array of the input number
        char[] originalDigits = String.valueOf(n).toCharArray();
        Arrays.sort(originalDigits);

        // Check against all powers of 2
        for (int i = 0; i < 31; i++) {
            int powerOfTwo = 1 << i; // Compute 2^i
            char[] powerDigits = String.valueOf(powerOfTwo).toCharArray();
            Arrays.sort(powerDigits);

            if (Arrays.equals(originalDigits, powerDigits)) {
                return true; // Match found
            }
        }
        return false; // No match found
    }
}