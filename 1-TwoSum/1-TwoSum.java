// Last updated: 2/10/2026, 12:24:42 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int numsLength = nums.length;
4        Map<Integer, Integer> map = new HashMap<>();
5
6        for(int i = 0; i < numsLength; i++){
7            int difference = target - nums[i];
8
9            if(map.containsKey(difference)){
10                return new int[]{map.get(difference), i};
11            }
12
13            map.put(nums[i], i);
14        }
15        return new int[]{};
16    }
17}