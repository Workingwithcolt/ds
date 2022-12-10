package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
public class StackAndQueue {
     static class Optimise{
         static Queue<Integer> q =new LinkedList<>();
         public static void push(int value) {
             q.add(value);
             for (int i = 0; i < q.size() - 1; i++) {
                 q.add(q.remove());
             }
         }

    }
    public static void ImplementStackByQueue(int[] arr){
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        Queue<Integer> q2 =new LinkedList<>();
        int i=0;
        while(true){
            q2.add(arr[i]);
            while(!q1.isEmpty()){
//                int el = q1.peek();
                int el = q1.remove();
                System.out.println(el+"is it element");
                q2.add(el);
            }
            temp = q2;
            q2 = q1;
            q1 = temp;//swaping
            i++;
            if(q1.size() == arr.length){
                break;
            }
        }
        while (!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.poll();
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        ImplementStackByQueue(arr);
        for (int i=0;i< arr.length;i++) {
            Optimise.push(arr[i]);
        }
        while(!Optimise.q.isEmpty()){
            System.out.println(Optimise.q.peek()+" it is element");
            Optimise.q.remove();
        }
    }
}
