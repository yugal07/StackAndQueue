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
    public static boolean isBalanced(String string){
        Stack <Character> stack = new Stack<>();

        for(char c: string.toCharArray()){
            if(c == '[' || c == '(' || c == '{'){
                stack.push(c);
            }

            else {
                if(stack.isEmpty()){
                    return false;
                }

                Character top = stack.pop();
                
                if((c == ']' && top != '[') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                    return false;
                }
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
