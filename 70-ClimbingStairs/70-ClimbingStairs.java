// Last updated: 5/18/2025, 7:01:45 PM
class Solution {
    public int climbStairs(int n) {

        int previous = 1;
        int previousToPrevious = 1;
        int current = 1;

        for(int i = 2;i<=n;i++){
            current = previous + previousToPrevious;
            previousToPrevious = previous;
            previous = current;
        }

        return current;
    }
}