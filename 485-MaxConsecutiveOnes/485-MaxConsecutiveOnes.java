class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,count = 0;
        for(int num:nums){
            if(num == 1){
                count++;
            } else {
                if(count > max){
                    max = count;
                }
                count = 0;
            }
        }
        if(count > max){
            max = count;
          }
        return max;
    }
}