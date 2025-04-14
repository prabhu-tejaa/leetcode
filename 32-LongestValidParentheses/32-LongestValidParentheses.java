// Last updated: 4/15/2025, 4:54:09 AM
class Solution {
    public int longestValidParentheses(String s) {
        		Stack<Integer>stack = new Stack<>();
        char[] ch = s.toCharArray();
        int sLength = s.length();

        for(int i = 0; i<sLength;i++){
            if(ch[i] == '('){
                stack.push(i);
            } else {
                if(!stack.isEmpty()){
                    ch[stack.pop()] = '*';
                    ch[i] = '*';
                }
            }
        }

        int res = 0, current = 0;
        for(int i = 0; i<sLength;i++){
            if(i < sLength && ch[i] == '*'){
                current++;
            } else {
                res = Math.max(res, current);
                current = 0;
            }
        }
        return Math.max(current, res);
    }
}