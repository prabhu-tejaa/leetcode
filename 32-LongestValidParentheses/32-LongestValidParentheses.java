// Last updated: 4/15/2025, 4:01:22 AM
class Solution {
    public int longestValidParentheses(String s) {
        int maxLength = 0;
        int start = -1;
        Stack<Integer> queue = new Stack<>();
        int sLength = s.length();

        for (int i = 0; i < sLength; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                queue.push(i);
            } else {
                if (!queue.isEmpty()) {
                    queue.pop();

                    if (queue.isEmpty()) {
                        maxLength = Math.max(maxLength, i - start);
                    } else {
                        maxLength = Math.max(maxLength, i - queue.peek());
                    }
                } else {
                    start = i;
                }
            }
        }
        return maxLength;
    }
}
