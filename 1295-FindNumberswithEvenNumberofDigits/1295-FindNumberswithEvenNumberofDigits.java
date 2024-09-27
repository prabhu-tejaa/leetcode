class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;
        for(int i:nums){
            if((i>=10 && i<=99) || (i>=1000 && i<=9999) || (i==100000)){
                answer++;
            }
        }
        return answer;
    }
}