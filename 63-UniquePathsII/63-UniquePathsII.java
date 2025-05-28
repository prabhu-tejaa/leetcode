// Last updated: 5/28/2025, 5:38:24 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // If start or end is an obstacle, no paths.
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        int[][] dp = new int[m][n];
        
        // Initialize the bottom-right cell
        dp[m - 1][n - 1] = 1;

        // Initialize last row
        for (int j = n - 2; j >= 0; j--) {
            dp[m - 1][j] = (obstacleGrid[m - 1][j] == 0) ? dp[m - 1][j + 1] : 0;
        }

        // Initialize last column
        for (int i = m - 2; i >= 0; i--) {
            dp[i][n - 1] = (obstacleGrid[i][n - 1] == 0) ? dp[i + 1][n - 1] : 0;
        }

        // Fill the rest of the dp table
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                }
            }
        }

        return dp[0][0];
    }
}
