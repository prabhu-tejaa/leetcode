// Last updated: 7/17/2025, 11:17:58 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int numsLength = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < numsLength - 2; i++){

            int left = i + 1;
            int right = numsLength - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if(sum > 0){
                    right--;
                } else {
                    left++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}