// Last updated: 4/14/2025, 11:59:32 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int temperaturesLength = temperatures.length;
        Stack<Integer>stack = new Stack<>();
        int[] ans = new int[temperaturesLength];

        for(int i = temperaturesLength-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek()-i;
            stack.push(i);
        }
        return ans;
    }
}