class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListQueue {
    private Node front;
    private Node rear;
    private int size;

    LinkedListQueue(){
        this.front  = null;
        this.rear = null;
        this.size = 0;
    }
    public void enqueue(int element){
        Node newNode = new Node(element);
        if(rear == null){
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = rear.next;
        }
        size++;
        System.out.println("Enqueued " +  element);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int item = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }
        System.out.println("Dequeued " + item);
        size--;
        return item;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public int size(){
        return size;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.display();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.display();
        System.out.println(queue.isEmpty());
    }
}
