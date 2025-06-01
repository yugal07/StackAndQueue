//  Practice Exercise 1: Build Your Own Array Stack
// Problem: Modify the ArrayStack to handle String data instead of integers.
// Requirements:

// Change the data type from int to String
// Add a method contains(String item) that returns true if the item exists in the stack
// Test with pushing: "apple", "banana", "cherry"


public class CustomArrayStack {
    private String[] arr;
    private int top;
    private int capacity;
    
    CustomArrayStack(int capacity){
        this.capacity = capacity;
        this.arr = new String[capacity];
        this.top = -1;
    }

    public void push(String string){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        arr[++top] = string;
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return "Empty";
        }
        return arr[top--];
    }
    public String peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return "empty";
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity;
    }

    public int size(){
        return top + 1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack from top to bottom: ");

        for(int i = top ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public boolean contains(String string){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return false;
        }
        for(int i = top ; i >= 0 ; i--){
            if(arr[i].equals(string)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CustomArrayStack stack = new CustomArrayStack(5);
        
        stack.push("apple");
        stack.push("Orange");
        stack.push("cherries");
        stack.display();
        System.out.println(stack.contains("apple"));
        System.out.println(stack.contains("mango"));
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
        stack.display();
    }
}
