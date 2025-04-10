// Last updated: 4/10/2025, 6:20:45 AM
class Solution {
    public int findPairs(int[] nums, int k) {
        int numsLength = nums.length;
        int left = 0, right = 1, count = 0;

        Arrays.sort(nums);

        while(right<numsLength){
            if(left == right || nums[right] - nums[left] > k){
                left++;
            } else if (nums[right] - nums[left] < k){
                right++;
            } else {
                count++;
                left++;
                while(left < numsLength && nums[left] == nums[left-1]){
                    left++;
                }
            }
            if (left >= right) {
                right = left + 1;
            }
        }
        return count;
    }
}