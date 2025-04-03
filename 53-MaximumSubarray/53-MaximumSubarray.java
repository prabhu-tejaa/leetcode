// Last updated: 4/3/2025, 11:43:30 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int num:nums){
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum <0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}