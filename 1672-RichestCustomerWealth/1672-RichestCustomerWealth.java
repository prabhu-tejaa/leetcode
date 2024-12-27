class Solution {
    public int maximumWealth(int[][] accounts) {
        int highestWealth = 0;
        for(int[] customers: accounts){
            int customerWealth = 0;
            for(int wealth: customers){
                customerWealth += wealth;
            }
            highestWealth = Math.max(highestWealth, customerWealth);
        }
        return highestWealth;
    }
}