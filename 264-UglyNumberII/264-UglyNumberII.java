// Last updated: 4/10/2025, 4:22:13 AM
class Solution {
    public int nthUglyNumber(int n) {
        int[] answer = new int[n];
        int i2=0,i3=0,i5=0;
        answer[0] = 1;

        for(int i = 1;i<n;i++){
            int next2 = answer[i2] * 2;
            int next3 = answer[i3] * 3;
            int next5 = answer[i5] * 5;

            int nextUglyNumber = Math.min(next2, Math.min(next3, next5));
            answer[i] = nextUglyNumber;

            if(nextUglyNumber == next2){
                i2++;
            }
            if(nextUglyNumber == next3){
                i3++;
            }
            if(nextUglyNumber == next5){
                i5++;
            }
        }
            return answer[n-1];
    }
}