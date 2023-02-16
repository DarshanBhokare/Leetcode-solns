class MyQueue {
    int front;
    int end;
    int[] data;
    public MyQueue() {
        this.front=0;
        this.end=-1;
        this.data=new int[101];
    }
    
    public void push(int x) {
        data[++end]=x;
    }
    
    public int pop() {
        int removedItem = data[front];
        for(int i=0;i<=end;i++){
            data[i]=data[i+1];
        }
        end--;
        return removedItem;
    }
    
    public int peek() {
        return data[front];
    }
    
    public boolean empty() {
        if(end>-1)
            return false;
        return true;
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