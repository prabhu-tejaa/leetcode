class Solution {
    public int[] runningSum(int[] nums) {
        int numsSize = nums.length;
        for(int i = 1; i<numsSize; i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}