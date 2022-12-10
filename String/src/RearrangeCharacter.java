import java.util.Stack;
public class RearrangeCharacter {
    public static String adjacentnotsame(String str){
        String newString = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(!stack.isEmpty() && (stack.peek() != str.charAt(i))){
                Character popedstring =' ' ;
                popedstring = stack.pop();
                System.out.println(str.charAt(i));
                if(popedstring != str.charAt(i))
                    newString += " ".concat(str.charAt(i) + "" + popedstring);
            }else {
                stack.push(str.charAt(i));
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(adjacentnotsame("geeksfor"));
    }
}
