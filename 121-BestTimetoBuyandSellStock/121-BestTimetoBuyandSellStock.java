// Last updated: 2/5/2026, 2:58:02 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int pricesLength = prices.length;
4        int minPrice = Integer.MAX_VALUE;
5        int maxProfit = 0;
6
7        for(int i = 0; i < pricesLength; i++){
8            if(prices[i] < minPrice){
9                minPrice = prices[i];
10            }
11
12            if(prices[i] - minPrice > maxProfit){
13                maxProfit = prices[i] - minPrice;
14            }
15        }
16        return maxProfit;
17    }
18}