import java.util.Stack;

public class MinimumBracketreversalneddedtomakebalanceB {
    static class Stackelement{
        int index;
        char value;
        public Stackelement(int index,char value){
            this.value = value;
            this.index = index;
        }
    }
    static int countMinReversal(String expr){
        int len  = expr.length();
        int ans;
        if(len%2 == 0){
            return -1;
        }
        int leftbrace = 0,rightbrace = 0;
        for(int i=0;i<len;i++){
            char c = expr.charAt(i);
            if(c == '{'){
                leftbrace++;
            }else {
                if(leftbrace == 0){
                    rightbrace++;
                }else {
                    leftbrace--;
                }
            }
        }
        ans = (int)((Math.ceil(0.0 +leftbrace)/2)+Math.ceil((0.0+rightbrace)/2));
        return ans;
    }
    public static int  simple(int index ,String s){
        int len = s.length();
//        if(len%2 != 0){
//            return;
//        }
        Stack<Stackelement> stack = new Stack<>();
        for(int i=0;i<len;i++){
            char letter= s.charAt(i);
            if(letter == ']' && !stack.isEmpty()){
                if(stack.peek().value == '['){
                    Stackelement number  = stack.pop();
                    if(number.index == index){
                        return i;
                    }
                }else{
                    Stackelement m =new Stackelement(i,letter);
                    stack.push(m);
                }
            }else if(letter == '[' || letter == ']'){
                Stackelement m =new Stackelement(i,letter);
                stack.push(m);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "[ABC[23]][89]";
        System.out.println(s.charAt(0));
        System.out.println(simple(4,s));
    }
}
