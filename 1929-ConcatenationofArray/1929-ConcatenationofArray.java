class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsSize = nums.length;
        int[] ans = new int[numsSize*2];
        for(int i = 0; i<numsSize; i++){
            ans[i] = nums[i];
            ans[i+numsSize] = nums[i];
        }
        return ans;
    }
}