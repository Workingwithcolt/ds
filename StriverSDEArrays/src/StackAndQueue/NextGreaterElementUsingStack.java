package StackAndQueue;

import java.util.Stack;

public class NextGreaterElementUsingStack {
    public void Optimise(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] newarr = new int[arr.length];
       for(int i=arr.length*2-1;i>=0;i--){
           while(!stack.isEmpty() && stack.peek() <= arr[i%arr.length]){
               stack.pop();
           }
           if(i<arr.length){
               if(!stack.isEmpty()){
                   newarr[i] = stack.peek();
               }else{
                   newarr[i] = -1;
               }
           }
           stack.push(i%arr.length);
       }
    }
}
