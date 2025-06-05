package stack;

import java.util.Arrays;
import java.util.Stack;

// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

// Example 1:


// Input: heights = [2,1,5,6,2,3]
// Output: 10
// Explanation: The above is a histogram where width of each bar is 1.
// The largest rectangle is shown in the red area, which has an area = 10 units.
// Example 2:


// Input: heights = [2,4]
// Output: 4


public class LargestRectangleInHistogram {
    

    public static int[] nextSmallerElement(int arr[]) {
        Stack <Integer> stack = new Stack<>();
        int result[] = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++) {
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                result[stack.pop()] = i;
            }
            stack.push(i);
        }

        for(int i = 0 ; i < arr.length ; i++) {
            if(result[i] == 0){
                result[i] = arr.length;
            }
        }
        return result;
    }
    public static int[] prevSmallerElement(int arr[]) {
        Stack <Integer> stack = new Stack<>();
        int result[] = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++) {
            result[i] = -1;
        }

        for(int i = arr.length -1 ; i >= 0  ; i-- ) {
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                result[stack.pop()] = i;
            }
            stack.push(i);
        }
        return result;
    }
    public static int largestRectangleArea(int arr[]) {
        int maxArea = 0;
        int[] nextSmallerArray = nextSmallerElement(arr);
        int[] prevSmallerArray = prevSmallerElement(arr);
        for(int i = 0 ; i < arr.length ; i++) {
            maxArea = Math.max(maxArea, arr[i] * (nextSmallerArray[i] - prevSmallerArray[i] - 1));
        }
        return maxArea;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextSmallerElement(new int[] {2,1,5,6,2,3})));
        System.out.println(Arrays.toString(prevSmallerElement(new int[]{2,1,5,6,2,3})));
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
        System.out.println(largestRectangleArea(new int[] {2,4}));
    }
}
