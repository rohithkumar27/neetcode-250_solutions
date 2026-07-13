class MyQueue {
    private Deque<Integer> st1= new ArrayDeque<>();
    private Deque<Integer> st2= new ArrayDeque<>();

    public MyQueue() {
        this.st1=new ArrayDeque<>();
        this.st2=new ArrayDeque<>();

    }
    
    public void push(int x) {
        st1.push(x);
        
    }
    
    public int pop() {
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                int peek=st1.peek();
                st1.pop();
                st2.push(peek);
            }   
        }
        return st2.pop();
        
    }
    
    public int peek() {
        // if peek is the seethe first element
    if(st2.isEmpty()){
            while(!st1.isEmpty()){
                int peek=st1.peek();
                st1.pop();
                st2.push(peek);
            }   
        }
        return st2.peek();
        
    }

        
    
    
    public boolean empty() {
        if(st1.isEmpty() && st2.isEmpty()){
            return true;
        }

       return false;

        
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