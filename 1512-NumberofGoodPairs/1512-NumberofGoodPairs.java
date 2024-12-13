class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numsLength = nums.length;
        int answer = 0;
        for(int i = 0;i< numsLength;i++){
            for(int j = 0;j< numsLength;j++){
                if(nums[i] == nums[j] && i < j){
                    answer++;
                }
            }
        }
        return answer;
    }
}