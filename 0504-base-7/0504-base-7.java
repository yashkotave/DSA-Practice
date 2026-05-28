class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0"; // Handle the special case for 0
        StringBuilder result = new StringBuilder();
        boolean isNegative = num < 0; // Check if the number is negative
        num = Math.abs(num); // Work with the absolute value

        while (num > 0) {
            result.append(num % 7); // Append the remainder when divided by 7
            num /= 7; // Divide by 7 for the next digit
        }

        if (isNegative) result.append('-'); // Add the negative sign if needed
        return result.reverse().toString(); // Reverse the result and convert to string
    }
}
