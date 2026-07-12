class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        //if the end is on same day
        // int h1 = Integer.parseInt(startTime.substring(0, 2));
        // int m1 = Integer.parseInt(startTime.substring(3, 5));
        // int s1 = Integer.parseInt(startTime.substring(6, 8));

        // int h2 = Integer.parseInt(endTime.substring(0, 2));
        // int m2 = Integer.parseInt(endTime.substring(3, 5));
        // int s2 = Integer.parseInt(endTime.substring(6, 8));

        // return (h2 - h1) * 3600
        //      + (m2 - m1) * 60
        //      + (s2 - s1);
        

        //if the end is on the next day best suitable answer
        int start =
                Integer.parseInt(startTime.substring(0,2))*3600 +
                Integer.parseInt(startTime.substring(3,5))*60 +
                Integer.parseInt(startTime.substring(6,8));

        int end =
                Integer.parseInt(endTime.substring(0,2))*3600 +
                Integer.parseInt(endTime.substring(3,5))*60 +
                Integer.parseInt(endTime.substring(6,8));

        // Algo:
        // Convert both times into seconds.
        // If end is smaller,
        // it means next day.

        if(end < start){
            end += 24 * 60 * 60;
        }

        return end - start;
    }
}