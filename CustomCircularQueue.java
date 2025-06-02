// Problem: Modify the CircularQueue to handle String data instead of integers.
// Requirements:

// Change data type from int to String
// Add a method search(String item) that returns the position of an item (-1 if not found)
// Test with: "Apple", "Banana", "Cherry"

import java.util.Arrays;

public class CustomCircularQueue {
    private String arr[];
    private int size;
    private int front;
    private int rear;
    private int capacity;

    CustomCircularQueue(int capacity){
        this.capacity = capacity;
        this.arr = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(String element){
        if(isFull()){
            System.out.println("Queue is Full");
            return ;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = element;
        size++;
        System.out.println("Added the element " + element);
    }
    public String dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return "-1";
        }
        String element = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued " + element);
        return element;
    }
    public String peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return "-1";
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public int search(String string){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        for(int i = 0 ; i < size ; i++){
            int index = (front + i) % capacity;
            if(arr[index].equals(string)){
                return i;
            }
        }
        return -1;
    }
    public void display(){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        CustomCircularQueue queue = new CustomCircularQueue(5);

        queue.enqueue("Apple");
        queue.enqueue("Cherries");
        queue.enqueue("Banana");
        queue.display();
        System.out.println(queue.search("Apple"));
        queue.dequeue();
        System.out.println(queue.search("Apple"));
        System.out.println(queue.search("Cherries"));
        for(int i = 0 ; i < 4 ; i++) {
            queue.enqueue("Sample");
        }
        queue.display();
    }
}
