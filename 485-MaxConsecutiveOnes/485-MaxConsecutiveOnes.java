class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int highestCounter = 0;
        int counter = 0;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == 1){
                counter++;
                if(counter > highestCounter){
                    highestCounter = counter;
                }
            } else {
                counter = 0;
            }
        }
        return highestCounter;
        
    }
}