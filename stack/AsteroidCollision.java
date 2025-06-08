package stack;

import java.util.Arrays;
import java.util.Stack;

// We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

// For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

// Example 1:

// Input: asteroids = [5,10,-5]
// Output: [5,10]
// Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
// Example 2:

// Input: asteroids = [8,-8]
// Output: []
// Explanation: The 8 and -8 collide exploding each other.
// Example 3:

// Input: asteroids = [10,2,-5]
// Output: [10]
// Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.

public class AsteroidCollision {
    public static int[] asteroidCollision(int arr[]) {
        Stack <Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < arr.length ; i++) {
            Boolean health = true;

            while(health && Integer.signum(arr[i]) == -1 && !stack.isEmpty() && Integer.signum(stack.peek()) == 1) {
                if(Math.abs(arr[i]) > Math.abs(stack.peek())) {
                    stack.pop();
                    continue;
                }
                else if(Math.abs(arr[i]) == Math.abs(stack.peek())){
                health = false;
                stack.pop();
                }
                else {
                    health = false;
                }
            }
            if(health) {
                stack.push(arr[i]);
            }
        }

        int [] result = new int[stack.size()];
        int i = 0;

        for(int element: stack) {
            result[i++] = element; 
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10,2,-5})));
    }
}
