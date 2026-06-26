class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;

        // Calculate the sum of ASCII values in string s
        for (char c : s.toCharArray()) {
            sumS += c;
        }

        // Calculate the sum of ASCII values in string t
        for (char c : t.toCharArray()) {
            sumT += c;
        }

        // The difference between the sums gives the extra character
        return (char)(sumT - sumS);
    }
}