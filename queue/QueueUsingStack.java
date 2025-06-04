package queue;

import java.util.Stack;

public class QueueUsingStack {
    Stack <Integer> stack1;
    Stack <Integer> stack2;
    
    public QueueUsingStack() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }
    
    public void push(int element) {
        stack1.push(element);
    }
    
    public int pop() {
        if(!stack2.isEmpty()) {
            return stack2.pop();
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    
    public int peek() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }
}
