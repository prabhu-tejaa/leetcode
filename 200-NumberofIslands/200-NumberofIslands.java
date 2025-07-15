// Last updated: 7/15/2025, 5:25:39 PM
class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int[][] visitedArray = new int[rows][columns];
        int noOfIslands = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(grid[i][j] == '1' && visitedArray[i][j] == 0){
                    noOfIslands++;
                    dfs(i, j, rows, columns, grid, visitedArray);
                }
            }
        }
        return noOfIslands;
    }

    void dfs(int i, int j, int rows, int columns, char[][] grid, int[][] visited){
        visited[i][j] = 1;

        int[] X = {-1, 0, 1, 0};
        int[] Y = {0, 1, 0, -1};

        for(int k = 0; k < 4; k++){
            int newX = i + X[k];
            int newY = j + Y[k];

            if(checkBoundary(newX, newY, rows, columns, grid, visited)){
                dfs(newX, newY, rows, columns, grid, visited);
            }
        }
    }

    boolean checkBoundary(int newX, int newY, int rows, int columns, char[][] grid, int[][] visited){
        return newX >= 0 && newY >= 0 && newX < rows && newY < columns && grid[newX][newY] == '1' && visited[newX][newY] == 0;
    }
}