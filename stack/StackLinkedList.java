package stack;
class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    private Node top;
    private int size;

    StackLinkedList(){
        this.top = null;
        this.size = 0;
    }

    public void push(int element){
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed " + element);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
    public int size(){
        return size;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack from top to bottom: ");

        Node current = top;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.display();
        stack.pop();
        stack.peek();
        stack.push(40);
        stack.push(60);
        stack.display();
        System.out.println(stack.size());
    }
}
