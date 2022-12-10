package StackAndQueue;

import java.util.Stack;

public class CheckForBalanceParanthesis {
    public static boolean BalanceParanthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                s.push(str.charAt(i));
            }else{
                if(s.peek() == '(' && str.charAt(i) == ')'||  s.peek() == '[' && str.charAt(i) == ']' || s.peek() == '{' && str.charAt(i) == '}' ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        return (s.isEmpty()) ? true :false;
    }

    public static void main(String[] args) {
       String str ="()[{}()]";
        System.out.println(BalanceParanthesis(str));
    }
}
