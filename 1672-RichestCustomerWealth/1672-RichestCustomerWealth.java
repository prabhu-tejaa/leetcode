class Solution {
    public int maximumWealth(int[][] accounts) {
        int highestWealth = 0;
        // for(int i = 0; i<accounts.length;i++){
        //     int customerWealth = 0;
        //     for(int j = 0; j<accounts[i].length;j++){
        //         customerWealth += accounts[i][j];
        //     }
        //     if(customerWealth > highestWealth){
        //         highestWealth = customerWealth;
        //     }
        // }

        for(int customer[] : accounts){
            int customerWealth = 0;
            for(int money : customer){
                customerWealth += money;
            }
            highestWealth = Math.max(highestWealth, customerWealth);
        }

        return highestWealth;
    }
}