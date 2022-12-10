package StackAndQueue;

    import java.util.Arrays;
    import java.util.Stack;

public class SortTheStack {
    public static void SortStack(Stack<Integer> stack){
        Stack<Integer> stack2 = new Stack<>();
        int size = stack.size();
        while(true){
            if(!stack.isEmpty() && !stack2.isEmpty()) {
                if (stack2.peek() < stack.peek()) {
                    int temp = stack.pop();
                    while(!stack2.isEmpty() && temp > stack2.peek()) {
                        stack.push(stack2.pop());
                    }
                    stack2.push(temp);
                } else if (stack.peek() < stack2.peek()) {
                    stack2.push(stack.pop());
                }
            }else {
                stack2.push(stack.pop());
            }
            if(stack2.size() == size){
                break;
            }
        }
        stack = stack2;
    }
    public static void Optimise(Stack<Integer> s){
       int[] arr = new int[s.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.pop();
        }
        Arrays.sort(arr);
        for(int i= arr.length-1;i>=0;i--){
            s.push(arr[i]);
        }
        for (int i=0;i<arr.length;i++) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,785,3323,5449,1756,186,175,269,1446,4193,5039 };
        Stack<Integer> s = new Stack<>();
        for (int e:arr) {
            s.push(e);
        }
        Optimise(s);
    }
}
