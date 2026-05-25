class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.size() > 0){
            if(minStack.peek() >= val){
                minStack.push(val);
            }
        }
        else{
            minStack.push(val);
        }
    }
    
    public void pop() {
        int ele = st.pop();
        if(ele == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
