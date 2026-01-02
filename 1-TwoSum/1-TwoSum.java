// Last updated: 1/2/2026, 9:14:33 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int lengthOfNumsArray = nums.length;
4
5        for(int i = 0; i < lengthOfNumsArray; i++){
6            for(int j = i+1; j < lengthOfNumsArray; j++){
7                if(nums[i]+nums[j] == target){
8                    return new int[]{i,j};
9                }
10            }
11        }
12        return new int[]{-1, -1};
13    }
14}