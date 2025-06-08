package stack;
            // "()",           // true
            // "()[]{}",       // true
            // "([{}])",       // true
            // "([)]",         // false
            // "(((",          // false
            // ")))",          // false
            // "{[()]}",       // true
            // ""              // true (empty string)

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean isBalanced(String string) {
        Stack <Character> stack = new Stack<>();

        for(int i = 0 ; i < string.length() ; i++) {
            if(string.charAt(i) == '(' || string.charAt(i) == '[' || string.charAt(i) == '{') {
                stack.push(string.charAt(i));
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }

                Character c = stack.peek();
                if((c == '(' && string.charAt(i) == ')') || (c == '{' && string.charAt(i) == '}') || (c == '[' && string.charAt(i) == ']')) {
                    stack.pop();
                    continue;
                }else return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String[] testCases = {
            "()",           // true
            "()[]{}",       // true
            "([{}])",       // true
            "([)]",         // false
            "(((",          // false
            ")))",          // false
            "{[()]}",       // true
            ""              // true (empty string)
        };

        for (String test : testCases) {
            System.out.println("\"" + test + "\" is balanced: " + isBalanced(test));
        }
    }
}
