package StackAndQueue;
import java.util.Stack;

public class MinStackSecondApproach {
    static long min = Long.MAX_VALUE;
    public static Stack<Long> stack= new Stack<>();
    public static void push(long value) {
        if(stack.isEmpty()){
            stack.push(value);
            min = value;
        }else{
            if(min > value){
                stack.push(2*value-min);
                min= value;
            }else{
                stack.push(value);
            }
        }
    }
    public static void pop(){
        if(stack.isEmpty())return;
        Long el = stack.pop();
        stack.pop();
        if(el < min){
            min = 2*min-el;
        }
    }
    public int top() {
        if (stack.isEmpty()) return -1 ;
        Long el = stack.peek();
        if (el < min) {
            return (int)min;
        }
        return el.intValue();
    }
        public static  int getMin(){
            return (int)min;
        }

    public static void main(String[] args) {
        Long[] arr = {1l,2l,3l,4l,5l};
        for (Long e:arr) {
            push(e);
        }
        System.out.println(getMin());
    }
}
