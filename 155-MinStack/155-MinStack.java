// Last updated: 4/6/2025, 4:45:18 PM
class MinStack {
    Stack<Pair>minStack;

    public MinStack() {
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        int min = minStack.isEmpty() ? val : Math.min(val, minStack.peek().min);
        minStack.push(new Pair(val, min));
    }
    
    public void pop() {
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek().val;
    }
    
    public int getMin() {
        return minStack.peek().min;
    }

    class Pair {
        int val;
        int min;

        Pair(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */