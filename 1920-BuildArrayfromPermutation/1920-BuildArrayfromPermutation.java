class Solution {
    public int[] buildArray(int[] nums) {
        int numsSize = nums.length;
        int[] answer = new int[numsSize];
        for(int i = 0; i< numsSize; i++){
            answer[i]=nums[nums[i]];
        }
        return answer;
    }
}