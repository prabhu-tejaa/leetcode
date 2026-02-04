// Last updated: 2/4/2026, 10:08:14 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int sizeOfNums = nums.length;
4        Map<Integer,Integer> map = new HashMap<>();
5        for(int i = 0; i< sizeOfNums; i++){
6            int num = nums[i];
7            int difference = target - num;
8
9            if(map.containsKey(difference)){
10                return new int[]{map.get(difference), i};
11            }
12
13            map.put(num, i);
14        }
15        return new int[]{};
16    }
17}