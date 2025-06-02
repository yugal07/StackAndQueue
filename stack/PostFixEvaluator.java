package stack;

import java.util.Stack;

public class PostFixEvaluator {
    public static int evaluatePostfix(String string){
        Stack <Integer> stack = new Stack<>();

        for(char c : string.toCharArray()){
            if(Character.isDigit(c)) {
                stack.push(Integer.parseInt(Character.toString(c)));
            }
            else {
                int value2 = stack.pop();
                int value1 = stack.pop();

                switch (c) {
                    case '+':
                    stack.push(value1 + value2);
                    break;
                    case '-': 
                    stack.push(value1 - value2);
                    break;
                    case '*': 
                    stack.push(value1 * value2);
                    break;
                    case '/': 
                    stack.push(value1 / value2);
                }

            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostfix("231*+9-"));
    }
}
