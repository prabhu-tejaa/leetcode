class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n){
            return new int[0][0];
        }
        int[][] answer = new int [m][n];
        int i=0, j = 0;
        for(int nums:original){
            answer[i][j++]=nums;
            if(j>=n){
                j=0;
                i++;
            }
        }
        return answer;
    }
}