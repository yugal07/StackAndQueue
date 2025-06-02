package queue;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingQueue {
    public static Character firstNonRepeating(String string){
        HashMap <Character , Integer> frequencyMap = new HashMap<>();
        Queue <Character> queue = new LinkedList<>();

        for(char c : string.toCharArray()){
            frequencyMap.put(c , frequencyMap.getOrDefault(c , 0) + 1);
            queue.offer(c);

            while(!queue.isEmpty() && frequencyMap.get(queue.peek()) > 1){
                queue.poll();
            } 
        }
        return queue.isEmpty() ? null : queue.poll();
    }
    public static void main(String[] args) {
        Character result = firstNonRepeating("aabbcedf");

        if(result == null){
            System.out.println("No Non repeating character");
        }
        else {
            System.out.println("Character is " + result);
        }
    }
}
