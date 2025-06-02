package stack;

import java.util.Stack;

public class InfixToPostfix {
    public static int precedence(Character ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String string) {
        Stack <Character> stack = new Stack<>();
        StringBuffer result = new StringBuffer();

        for(char c : string.toCharArray()){
            if(c == ' ')  continue;

            else if(Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if(c == '(') {
                stack.push(c);
            }
            else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + infixToPostfix(infix));
    }

}