// Last updated: 7/18/2025, 9:54:50 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
         int n = amount + 1;
        int[] dp = new int[n];
        
        // Fill with a large value (more than the max possible coins)
        for (int i = 1; i < n; i++) {
            dp[i] = n;
        }
        
        dp[0] = 0; // base case
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    if (dp[i - coin] + 1 < dp[i]) {
                        dp[i] = dp[i - coin] + 1;
                    }
                }
            }
        }
        
        return dp[amount] == n ? -1 : dp[amount];
    }
}