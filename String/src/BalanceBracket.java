import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceBracket {
    public static  boolean areBracketBalanced(String exptr){
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<exptr.length();i++){
            char x = exptr.charAt(i);
            if(x == '(' || x == '[' || x == '{'){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char check;
            switch (x){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '['){
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '['){
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '(' || check == '{') {
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        String f = "([{}])";
        System.out.println();
    }
}
