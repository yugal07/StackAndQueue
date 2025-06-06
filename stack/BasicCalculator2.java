package stack;

import java.util.Stack;

public class BasicCalculator2 {
    public static int calculate(String string){
        Stack <Integer> stack = new Stack<>();
        int sign = '+';
        int num = 0;

        for(int i = 0 ; i < string.length() ; i++){
            Character c = string.charAt(i);

            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }

            if((!Character.isDigit(c) && c != ' ' ) || i == string.length() - 1){
                if(sign  == '+') {
                    stack.push(num);
                }
                else if(sign == '-'){
                    stack.push(-num);
                }
                else if(sign  == '*') {
                    stack.push(stack.pop() * num);
                }
                else if(sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = c;
                num = 0;
            }
        }
        int result = 0;

        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
    
}
