// Last updated: 4/16/2025, 4:50:08 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, sum=0,position=0;
        int length = gas.length;

        for(int i =0;i<length;i++){
            sum += gas[i] - cost[i];
            if(sum<0){
                total+=sum;
                sum = 0;
                position = i+1;
            }
        }
        total+=sum;
        return total>=0?position:-1;
    }
}