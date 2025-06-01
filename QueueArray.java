

public class QueueArray {
    private int arr[];
    private int size;
    private int front;
    private int rear;
    private int capacity;

    QueueArray(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.rear = -1;
        this.front = 0;
        this.size = 0;
    }

    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    public int dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public int getSize() {
        return size;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("Queue : ");
        for(int i = 0 ; i < size ; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Front: " + q.peek());
    }
}
