class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //bottom up tabulation
        // int  n = cost.length;
        // int[] dp = new int[n+2];
        // for(int i = n-1 ; i>=0; i--){
        //     dp[i] = cost[i] + Math.min(dp[i+1],dp[i+2]);
        // }
        // return Math.min(dp[0],dp[1]);

        int next1 = 0;
        int next2 =0;

        for(int i = cost.length-1; i>=0; i--){
            int current = cost[i] + Math.min(next1,next2);
            next2 = next1;
            next1 = current;
        }
        return Math.min(next1,next2);
    }
}