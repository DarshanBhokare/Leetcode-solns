class MyQueue {
    Stack<Integer> stackMain;
    Stack<Integer> stackTwo;
    public MyQueue() {
        this.stackMain= new Stack<Integer>();
        this.stackTwo= new Stack<Integer>();
    }
    
    public void push(int x) {
        while(!stackMain.isEmpty()){
            stackTwo.push(stackMain.pop());
        }
        stackMain.push(x);
        while(!stackTwo.isEmpty()){
            stackMain.push(stackTwo.pop());
        }
    }
    
    public int pop() {
        return stackMain.pop();
    }
    
    public int peek() {
        return stackMain.peek();
    }
    
    public boolean empty() {
        return stackMain.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */