class Solution {
    public int findNthDigit(int n) {
        // Step 1: Determine the digit length of numbers in the group
        int digitLength = 1;
        long count = 9;
        long start = 1;

        // Step 2: Locate the group containing the nth digit
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Step 3: Locate the exact number in the group
        long num = start + (n - 1) / digitLength;

        // Step 4: Find the exact digit in the number
        String numStr = Long.toString(num);
        return numStr.charAt((n - 1) % digitLength) - '0';
    }
}
