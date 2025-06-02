package queue;
// Problem: Write a method to reverse a queue using only a stack as auxiliary data structure.
// Hint:

// Dequeue all elements from queue and push to stack
// Pop all elements from stack and enqueue back to queue

// Example:

// Input queue: [1, 2, 3, 4]
// Output queue: [4, 3, 2, 1]

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack <Integer> stack = new Stack<>();

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        return queue;
    } 
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();

        for(int i = 0 ; i <= 10 ; i++) {
            queue.add(i);
        }
        System.out.println(reverseQueue(queue));
    }
}
