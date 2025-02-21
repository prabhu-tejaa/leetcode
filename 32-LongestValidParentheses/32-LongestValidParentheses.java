class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int stringLength = s.length();
        int result = 0;
        stack.push(-1);
        for(int i = 0; i<stringLength;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            } else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                } else {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }
}