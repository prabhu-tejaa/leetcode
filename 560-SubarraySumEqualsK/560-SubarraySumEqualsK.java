// Last updated: 3/30/2025, 7:03:26 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sizeOfNums = nums.length;
        int count = 0;

        for(int i = 0; i<sizeOfNums;i++){
            int sum=0;
            for(int j = i;j<sizeOfNums;j++){
                sum+=nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}