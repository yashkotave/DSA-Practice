class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        // Define StringBuilder array
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }

        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;

        while (index < n) {

            // down (top → bottom)
            for (int j = 0; j < numRows && index < n; j++) {
                sbs[j].append(arr[index++]);
            }

            // up (bottom → top, excluding first & last)
            for (int j = numRows - 2; j > 0 && index < n; j--) {
                sbs[j].append(arr[index++]);
            }
        }

        // combine all rows
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(sbs[i]);
        }

        return res.toString();
    }
}