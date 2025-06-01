import java.util.Stack;

public class ReverseString {
    public static String reverse(String string){
        Stack <Character> stack = new Stack<>();

        for(char c : string.toCharArray()){
            stack.push(c);
        }
        StringBuilder result = new StringBuilder();

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hello World"));
    }
}
