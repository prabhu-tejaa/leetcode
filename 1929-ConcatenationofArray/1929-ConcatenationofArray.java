class Solution {
    public int[] getConcatenation(int[] nums) {
        int lengthOfArray = nums.length;
        int[] answer = new int[lengthOfArray*2];
        for(int i = 0;i<lengthOfArray;i++){
            answer[i]=nums[i];
            answer[i+lengthOfArray]=nums[i];

        }
        return answer;
    }
}