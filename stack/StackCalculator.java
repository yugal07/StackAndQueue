package stack;
// Problem: Create a simple calculator that can:

// Push numbers onto a stack
// Pop two numbers and add them
// Pop two numbers and multiply them

import java.util.Stack;

public class StackCalculator {
    private Stack<Integer> stack;

    public StackCalculator(){
        this.stack = new Stack<>();
    }

    public void push(int number){
        stack.push(number);
        System.out.println("Pushed " + number);
    }
    public int add(){
        if(stack.size() < 2){
            System.out.println("Not Enough elements to add");
            return -1;
        }
        int a = stack.pop();
        int b = stack.pop();

        int result = a + b;
        stack.push(result);
        System.out.println(result);
        return result;
    }
    public int multiply(){
        if(stack.size() < 2){
            System.out.println("Not enough Elements to multiply");

            return -1;
        }
        int a = stack.pop();
        int b = stack.pop();

        int result = a * b;
        stack.push(result);
        System.out.println(result);
        return result;
    }
    public void printStack(){
        System.out.println("Current Stack : " + stack);
    }

    public static void main(String[] args) {
        StackCalculator stack = new StackCalculator();

        stack.push(2);
        stack.add();
        stack.push(5);
        stack.add();
        stack.printStack();
        stack.multiply();
        stack.push(8);
        stack.multiply();
    }
}
