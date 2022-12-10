package StackAndQueue;

import java.util.Stack;

public class MinStackfirstApproach {
    public static Stack<MinstackElement>  stack = new Stack<MinstackElement>();
    static class MinstackElement{
        Long minimum;
        Long current;
        MinstackElement(Long m,Long c){
            this.current = c;
            this.minimum = m;
        }
    }
    public static void push(Long value){
        Long min;
        if(stack.isEmpty()){
            min = value;
        }else{
            min = Math.min(value,stack.peek().minimum);
        }
        stack.push(new MinstackElement(min,value));
    }
    public static void pop(){
        stack.pop();
    }
    public static Long top(){
        return stack.peek().current;
    }
    public static Long getMin(){
        return stack.peek().minimum;
    }

    public static void main(String[] args) {
        Long[] arr= {1l,2l,3l,4l};
        for (Long e:arr) {
            push(e);
        }
        System.out.println(getMin());
    }

}
