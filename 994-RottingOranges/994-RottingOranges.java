// Last updated: 7/16/2025, 7:57:41 PM
class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        
        if(grid == null || rows == 0 || cols == 0){
            return -1;
        }
        
        int totalOranges = 0;
        int minutes = 0;
        int rottenOranges = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] != 0) {
                    totalOranges++;
                }
                if (grid[r][c] == 2) {
                    rottenOranges++;
                    queue.offer(new int[]{r, c});
                }
            }
        }

        int[] X = {-1, 0, 1, 0};
        int[] Y = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            boolean anyNewRotten = false;

            for(int i = 0; i < currentSize; i++) {
                int[] pairOfRowCols = queue.poll();

                if(pairOfRowCols == null) continue;
                
                int row = pairOfRowCols[0];
                int col = pairOfRowCols[1];

                for (int j = 0; j < 4; j++) {
                    int newX = row + X[j];
                    int newY = col + Y[j];

                    if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2;
                        queue.offer(new int[]{newX, newY});
                        rottenOranges++;
                        anyNewRotten = true;
                    }
                }
            }
        if (anyNewRotten) {
            minutes++;
        }
    }
        return (rottenOranges == totalOranges) ? minutes : -1;
    }
}