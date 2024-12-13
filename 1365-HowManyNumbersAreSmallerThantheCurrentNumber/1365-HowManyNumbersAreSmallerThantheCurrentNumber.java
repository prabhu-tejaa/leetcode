class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int numsSize = nums.length;
        int[] answer = new int[numsSize];
        int low = lower(nums);
        for(int i = 0;i < numsSize; i++){
            for(int j = 0; j< numsSize;j++){
                if(nums[i] > nums[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
    static int lower(int [] arr){
        int lowestValue = arr[0];
        for(int i = 1; i< arr.length;i++){
            if(arr[i] < lowestValue){
                lowestValue = arr[i];
            }
        }
        return lowestValue;

    }
}