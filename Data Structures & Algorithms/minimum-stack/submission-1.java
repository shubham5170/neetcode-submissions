// Just keep 2 stacks. 1 for all operations, while minStack which stores value if only they can potentially be min. SInce stack can only add number after another and you cannot remove bottom elements without removing top elements, we can say with confience that if number coming to stack later are bigger than previous number, they will never be minimum since they cwill be removed first

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val) minStack.push(val);
    }
    
    public void pop() {
           int val = stack.pop();
           if(val==minStack.peek()) minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
