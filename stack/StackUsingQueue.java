package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue <Integer> queue1;
    Queue <Integer> queue2;

    public StackUsingQueue() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public void push(int element) {
        queue2.add(element);

        while(queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
