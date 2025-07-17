// Last updated: 7/17/2025, 10:39:29 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int numLength = numbers.length;

        int left = 0;
        int right = numLength-1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[]{left+1,right+1};
            }

            if(sum > target){

                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }
}