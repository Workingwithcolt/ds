package StackAndQueue;

import java.util.Stack;

public class AreaLargestRectangleHistogram {
    public static  int LargestHistogram(int[] arr){
        int MaximumArea = Integer.MIN_VALUE;
        int count = 0;
        for(int  i=0;i<arr.length;i++){
            if( i != arr.length-1){
                for (int j=i;j< arr.length;j++){
                    if(arr[j]>=arr[i]){
                        count++;
                    }else{
                        break;
                    }
                }
            }//right
            if(i>0){
                for (int k=i-1;k>=0;k--){
                    if(arr[k] >= arr[i]){
                        count++;
                    }else{
                        break;
                    }
                }
            }//left
            if(MaximumArea < (arr[i]*count)){
                MaximumArea = (arr[i]*count);
            }
            count =0;
        }
        return MaximumArea;
    }
    public static void Optimiseway(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] left =new int[arr.length];
        int[] right = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(!stack.isEmpty()) {
                if (arr[i] > arr[stack.peek()]) {
                    left[i] = stack.peek() + 1;
                    stack.push(i);
                }else{
                    while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                        stack.pop();
                    }
                    if(!stack.isEmpty()){
                        left[i] = stack.peek()+1;
                        stack.push(i);
                    }else{
                        left[i] = 0;
                        stack.push(i);
                    }
                }
            }else{
                stack.push(i);
                left[i] = 0;
            }
        }
        while (!stack.isEmpty()){
            stack.pop();
        }
        for(int i=arr.length-1;i>=0;i--) {
            if (!stack.isEmpty()) {
                if (arr[i] > arr[stack.peek()]) {
                    right[i] = stack.peek() - 1;
                    stack.push(i);
                } else if (arr[i] < arr[stack.peek()]) {
                    while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                        stack.pop();
                    }
                    if (!stack.isEmpty()) {
                        right[i] = stack.peek() - 1;
                        stack.push(i);
                    } else {
                        right[i] = arr.length - 1;
                        stack.push(i);
                    }
                }
            }else{
                stack.push(i);
                right[i] =arr.length-1;
            }
        }
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maximum < ((right[i]- left[i]+1))*arr[i]){
                maximum = (right[i]- left[i]+1)*arr[i];
            }
        }
        System.out.println(maximum);
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3,1};
        Optimiseway(arr);
    }
}
