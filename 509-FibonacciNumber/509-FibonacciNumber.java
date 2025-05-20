// Last updated: 5/20/2025, 6:35:04 PM
class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int previous = 1;
        int previousToPrevious = 0;
        int current = 0;
        for(int i=2;i<=n;i++){
            current = previous+previousToPrevious;
            previousToPrevious = previous;
            previous = current;
        }
        return current;
    }
}