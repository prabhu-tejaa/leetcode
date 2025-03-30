// Last updated: 3/30/2025, 1:28:52 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sizeOfNumbersArray = numbers.length;
        int[] answer = new int[sizeOfNumbersArray];
        int initial = 0;

        int leftPointer = 0;
        int rightPointer = sizeOfNumbersArray - 1;

        while(leftPointer < rightPointer){
            int sum = numbers[leftPointer] + numbers[rightPointer];

            if(sum == target){
                return new int[]{leftPointer+1, rightPointer+1};
            }

            if(sum < target){
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return new int[]{};
    }
}