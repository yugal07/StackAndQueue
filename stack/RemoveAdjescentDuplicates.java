package stack;

import java.util.Stack;

public class RemoveAdjescentDuplicates {
    public static String removeDuplicates(String string){
        Stack <Character> stack = new Stack<>();
        StringBuffer result = new StringBuffer();

        for(char c : string.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        for(char c : stack) {
            result.append(c);
        }
        System.out.println(result);
        return result.toString();
    }
    public static void main(String[] args) {
        removeDuplicates("abbaca");
    }
}
