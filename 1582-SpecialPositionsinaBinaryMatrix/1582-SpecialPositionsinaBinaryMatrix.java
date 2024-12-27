class Solution {
    public int numSpecial(int[][] mat) {
        int rowSize = mat.length;
        int colSize = mat[0].length;
        int[] row = new int[rowSize];
        int[] col = new int[colSize];
        int answer = 0;
        for(int i = 0;i<rowSize;i++){
            for(int j = 0; j<colSize;j++){
                if(mat[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        int count = 0;

        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < colSize; j++){
                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}