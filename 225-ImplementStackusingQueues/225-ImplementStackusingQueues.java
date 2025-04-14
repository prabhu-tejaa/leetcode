// Last updated: 4/14/2025, 4:14:03 PM
class MyStack {

    Queue<Integer> que;
    public MyStack() {
        que = new LinkedList<>();
    }
    
    public void push(int x) {
        que.add(x);
        int size = que.size();
        size = size-1;
        for(int i = 0;i<size;i++){
            que.add(que.poll());
        }
    }
    
    public int pop() {
        return que.poll();
    }
    
    public int top() {
        return que.peek();
    }
    
    public boolean empty() {
        return que.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */