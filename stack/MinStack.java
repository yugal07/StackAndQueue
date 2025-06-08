package stack;

import java.util.Stack;

public class MinStack {
    public Stack <Integer> stack;
    public Stack <Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int element) {
        stack.push(element);
        if(minStack.isEmpty() || element <= minStack.peek()) {
            minStack.push(element);
        }
    }
    public void pop() {
        if(!stack.isEmpty()) {
            if(stack.peek() == minStack.peek()) {
                minStack.pop();
            }
            stack.pop();
        }
    }
    public int peek() {
        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.peek();
    }
    public int getMin() {
        if(minStack.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return minStack.peek();
    }
}
