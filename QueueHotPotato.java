// Problem: Simulate the "Hot Potato" game using a queue!

// Players sit in a circle: ["Tom", "Jerry", "Mickey", "Donald"]
// Count 3 positions, eliminate that player
// Continue until one player remains

// Algorithm:

// Enqueue all players
// For count-1 times: dequeue and enqueue (pass the potato)
// On count: dequeue and eliminate (hot potato!)
// Repeat until one player left

import java.util.LinkedList;
import java.util.Queue;

public class QueueHotPotato {
    public static String hotPotato(String players[] , int count){
        Queue <String> queue = new LinkedList<>();

        for(String player : players){
            queue.offer(player);
        }
        while(queue.size() > 1){
            for(int i = 0 ; i < count - 1 ; i++) {
                String player = queue.poll();
                queue.offer(player);
            }

            String eliminated = queue.poll();
            System.out.println("Eliminated " + eliminated);
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        String[] players = {"Tom", "Jerry", "Mickey", "Donald"};
        String winner = hotPotato(players, 3);
        System.out.println("Winner: " + winner);
    }
}
