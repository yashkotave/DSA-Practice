class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] maxReach=  new int[n+1];
        //maxReaxh[i] stores the furthest right point wastered by a tap satating at or before index i

        for(int i =0; i<=n; i++){
            int left = Math.max(0,i-ranges[i]);
            int right = Math.min(n,i+ranges[i]);
            maxReach[left] = Math.max(maxReach[left],right);

        }
        int taps =0;
        int coverage =0;
        int lastTapEnd =0;

        for(int i =0; i<n; i++){
            coverage = Math.max(coverage,maxReach[i]);

            // If we are stuck at point i and cannot progress further
            if( i == coverage) return -1;
            //Reached the boundary of previously chosen taps -> must open a new tap
            if(i == lastTapEnd) {
                lastTapEnd = coverage;
                taps++;

                if(coverage >= n){
                    return taps;
                }
            }
        }
        return taps;
    }
}