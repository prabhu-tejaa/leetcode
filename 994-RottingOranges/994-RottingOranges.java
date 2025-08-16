// Last updated: 8/16/2025, 8:35:41 PM
class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        if(grid == null || rows == 0 || cols == 0){
            return -1;
        }

        int TotalRottedOranges = 0;
        int totalOranges = 0;
        int minutes = 0;

        Queue<int[]> rottenOranges = new LinkedList<>();

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(grid[r][c] != 0){
                    totalOranges++;
                }

                if(grid[r][c] == 2){
                    TotalRottedOranges++;
                    rottenOranges.add(new int[]{r,c});
                }
            }
        }

        if(totalOranges == 0){
            return 0;
        }

        if(TotalRottedOranges == 0){
            return -1;
        }

        while(!rottenOranges.isEmpty()){
            int currrentQueueSize = rottenOranges.size();
            boolean anyRottedOranges = false;

            for(int i = 0; i < currrentQueueSize; i++){
                int[] rottedOrange = rottenOranges.poll();

                int row = rottedOrange[0];
                int col = rottedOrange[1];

                int[] X = {-1,0,1,0};
                int[] Y = {0,1,0,-1};

                for(int k = 0; k < 4; k++){
                    int newX = row + X[k];
                    int newY = col + Y[k];

                    if(newX >= 0 && newY >= 0 && newX < rows && newY < cols && grid[newX][newY] == 1){
                        grid[newX][newY] = 2;
                        rottenOranges.offer(new int[]{newX, newY});
                        TotalRottedOranges++;
                        anyRottedOranges = true;
                    }
                }
            }
            if(anyRottedOranges){
            minutes++;
            }
        }
        return TotalRottedOranges == totalOranges ? minutes : -1;
    }
}