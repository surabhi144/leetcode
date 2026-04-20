class MyQueue {
    int first;
    int size;
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        size = 0;
        first = 0;
    }
    
    public void push(int x) {
        if(size == 0)
         first = x;
        s1.push(x);
        size++;
    }
    
    public int pop() {
        int popped = 0;
        while(!s1.isEmpty()){
            if(s1.size() == 1){
                popped = s1.peek();
                s1.pop();
                size--;
                continue;
            }
            int k = s1.pop();
            s2.push(k);
        }
        if(s2.size() > 0)
         first = s2.peek();
        while(!s2.isEmpty()){
            int k = s2.pop();
            s1.push(k);
        }
        return popped;
    }
    
    public int peek() {
        return first;
    }
    
    public boolean empty() {
        return size == 0;
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