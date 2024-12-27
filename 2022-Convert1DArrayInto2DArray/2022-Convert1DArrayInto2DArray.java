class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] answer = new int[m][n];
        if(original.length != m*n){
            return new int[0][0];
        }
        int originalSize = original.length;
        int index = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                answer[i][j] = original[index++];
            }
        }
        return answer;
    }
}