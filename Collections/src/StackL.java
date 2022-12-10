import java.util.Stack;
public class StackL {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Chetan");
        stack.push("sakshi");
        stack.push("Aishvarya");
        stack.push("Manisha");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
