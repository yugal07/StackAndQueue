public class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    StackArray(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        arr[++top] = data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];
    }
    public int peek() {
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isFull(){
        return top == capacity - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int size(){
        return top + 1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack from top to bottom ");

        for(int i = top ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.display();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        
    }
}
