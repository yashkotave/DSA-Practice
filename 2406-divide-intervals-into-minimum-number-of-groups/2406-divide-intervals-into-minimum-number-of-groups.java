class Solution {
    public int minGroups(int[][] intervals) {
      if (intervals == null || intervals.length == 0) {
            return 0;
        }

        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        // Independently sort start and end points
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;
        int groups = 0;
        int maxGroups = 0;

        while (i < n) {
            // Inclusive intervals: sharing an endpoint counts as overlapping
            if (start[i] <= end[j]) {
                groups++;
                maxGroups = Math.max(maxGroups, groups);
                i++;
            } else {
                groups--;
                j++;
            }
        }

        return maxGroups;  
    }
}