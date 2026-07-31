class Solution {
    public String rearrangeString(String s, char x, char y) {
        int xCount = 0;
        int yCount = 0;
        StringBuilder otherChars = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == x) {
                xCount++;
            } else if (c == y) {
                yCount++;
            } else {
                otherChars.append(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(String.valueOf(y).repeat(yCount));
        ans.append(otherChars);
        ans.append(String.valueOf(x).repeat(xCount));

        return ans.toString();
    }
}