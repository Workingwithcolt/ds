package StackAndQueue;

import java.util.Stack;

public class ImplementQueueBystack {
    public static void QueueImplementationByStack(int[] arr){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> temp;
        int i=0;
        while(i<arr.length){
            stack2.push(arr[i]);
            while(!stack1.isEmpty()){
                int topElement = stack1.pop();
                stack2.push(topElement);
            }
            if(stack2.size() == arr.length){
                break;
            }
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }

            i++;
        }
        while(!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }
    static class Queue{
        static Stack<Integer> stack1 = new Stack<>();
        static  Stack<Integer> stack2 = new Stack<>();
        public static Stack<Integer> insert(int[] arr){
            for(int i=0;i<arr.length;i++) {
                push(arr[i]);
            }
            return stack2;
        }
        public static void push(int value){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            stack2.push(value);
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
//        QueueImplementationByStack(arr);
        Stack<Integer> s;
        Queue.insert(arr);
        s = Queue.stack2;
        int lengthofs = s.size();
        for(int i=0;i<lengthofs;i++) {
            System.out.println(s.pop());
        }
    }
}
