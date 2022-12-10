package StackAndQueue;
import java.util.*;
public class NextSmaller {
    public static void nexts(int[] s){
        Stack<Integer> newstack =new Stack<>();
        int[] nsm = new int[s.length];
        for(int i=s.length-1;i>=0;i--){
            if(newstack.isEmpty()){
                nsm[i] = -1;

            }else if(newstack.peek() < s[i]){
                nsm[i] = newstack.peek();
            }else if(newstack.peek() >= s[i]){
                while(!newstack.isEmpty() && s[i] <= newstack.peek()){
                    newstack.pop();
                }
                if(!newstack.isEmpty()) {
                    nsm[i] = newstack.peek();
                }else{
                    nsm[i] =-1;
                }
            }
            newstack.push(s[i]);
        }
        for (int e:nsm) {
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        nexts(arr);
    }
}
