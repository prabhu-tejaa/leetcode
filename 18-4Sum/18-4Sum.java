// Last updated: 7/17/2025, 11:33:42 PM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int numsLength = nums.length;

        for(int i = 0; i < numsLength - 3; i++){
            for(int j = i + 1; j < numsLength -2; j++){
                
                int left = j + 1;
                int right = numsLength - 1;
                
                while(left < right){
                long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    left++;
                    right--;
                } else if(sum > target){
                    right--;
                } else {
                    left++;
                }
                }
            }
        }
        return new ArrayList<>(result);
    }
}