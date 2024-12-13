class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestKid = highest(candies);
        int sizeOfCandiesArray = candies.length;
        ArrayList<Boolean> answer = new ArrayList<>();
        for(int i = 0; i<sizeOfCandiesArray;i++){
            int sumByGivingExtraCandies = candies[i] + extraCandies;
            if(sumByGivingExtraCandies >= highestKid){
                answer.add(true);
            } else {
                answer.add(false);
            }
        }
    return answer;
    }
    static int highest(int[] candies){
        int kidWithHighCandies = candies[0];
        for(int i = 1; i<candies.length;i++){
            if(candies[i] > kidWithHighCandies){
                kidWithHighCandies = candies[i];
            }
        }
        return kidWithHighCandies;
    }
}