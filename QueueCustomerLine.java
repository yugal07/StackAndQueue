// Problem: Create a program that:

// Enqueues the strings "Alice", "Bob", "Charlie", "Diana"
// Prints the queue
// Dequeues two people and prints who was served
// Enqueues "Eve"
// Prints the final queue

import java.util.LinkedList;
import java.util.Queue;

public class QueueCustomerLine {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        queue.offer("Diana");

        System.out.println(queue);

        System.out.println("Served " + queue.poll());
        System.out.println("Served " + queue.poll());

        queue.offer("Eve");
        System.out.println(queue);
    }
}
