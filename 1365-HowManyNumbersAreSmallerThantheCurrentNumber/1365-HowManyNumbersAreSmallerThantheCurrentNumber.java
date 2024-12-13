class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int numsSize = nums.length;
        int[] answer = new int[numsSize];
        for(int i = 0;i < numsSize; i++){
            for(int j = 0; j< numsSize;j++){
                if(nums[i] > nums[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}