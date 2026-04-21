class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp =  new int[amount+1];

        //fill with large value;

        for(int i = 0; i<=amount; i++){
            dp[i] = amount+1;
        } 

        dp[0] = 0; // o amount  ke liye 0 coin

        for( int i =1; i<=amount; i++){
            for(int coin: coins){
                if(i>=coin){
                    dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }

        return (dp[amount]>amount) ?-1 : dp[amount];
    }
}