class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> (a[0] - b[0]));
        int start = 0, end = 0, res = days;

        for(int[] meeting : meetings) {
            if(meeting[1] <= end) {
                continue;
            }
            if(meeting[0] > end) {
                res -= end - start + 1;
                start = meeting[0];
                end = meeting[1];
            } else {
                end = Math.max(end, meeting[1]);
            }
        }
        res -= end - start;

        return res;    
    }
}