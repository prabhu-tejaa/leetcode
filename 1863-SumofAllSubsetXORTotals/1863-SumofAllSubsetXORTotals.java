class Solution {
    public int subsetXORSum(int[] nums) {
        int arraySize = nums.length;
        int sumOfXor = 0;
        for(int i = 0; i < (1<<arraySize); i++){
            int xor = 0;
            for(int j = 0; j<arraySize;j++){
                int bitmask = (1<<j);
                if((i&bitmask) != 0){
                    xor ^= nums[j];
                }
            }
            sumOfXor += xor;
        }
        return sumOfXor;
    }
}