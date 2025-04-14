// Last updated: 4/14/2025, 5:21:58 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();

        for(String st : tokens){
            if(st.equals("/") || st.equals("*") || st.equals("+") || st.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                int result = 0;
                if(st.equals("/")){
                    result = first/second;
                } else if(st.equals("*")){
                    result = first*second;
                } else if(st.equals("+")){
                    result = first+second;
                } else {
                    result = first-second;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(st));
            }
        }
        return stack.pop();
    }
}