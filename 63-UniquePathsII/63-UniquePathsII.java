// Last updated: 7/24/2025, 11:27:13 PM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1 || obstacleGrid[rows-1][columns-1] == 1){
            return 0;
        }

        int[][] dp = new int[rows][columns];

        for(int i = columns - 1; i >= 0; i--){
            if(obstacleGrid[rows - 1][i] == 1) break;
            dp[rows - 1][i] = 1;
        }

        for(int i = rows - 1; i >= 0; i--){
            if(obstacleGrid[i][columns - 1] == 1) break;
            dp[i][columns - 1] = 1;
        }

        for(int i = rows - 2; i >= 0; i--){
            for(int j = columns - 2; j >= 0; j--){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i+1][j] + dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }
}