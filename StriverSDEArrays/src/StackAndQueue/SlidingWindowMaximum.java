package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static  void MaximumValueInWindow(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            int start = i,end = i+k-1;
            if(end>arr.length-1){
                break;
            }
            int Max = Integer.MIN_VALUE;
            for(int j =start;j<=end;j++){
                if(Max < arr[j]){
                    Max = arr[j];
                }
            }
            System.out.println(Max);
        }
    }
    public static void Optimise(int[] arr,int k){
        Deque<Integer> dq =new ArrayDeque<>();
        int[] r =new int[arr.length-k-1];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if( !dq.isEmpty() && dq.peekFirst() == i-k){
                dq.poll();
            }
            while(arr[i] > arr[dq.peekLast()] && !dq.isEmpty()){
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1){
                r[index++] = dq.peekFirst();
            }//here we are iterating one by one when 3 element ground is found first then we store greter
            //element
        }
    }
    public static void main(String[] args) {
        int[] ar = {4,0,-1,3,5,3,6,8};
        int k = 2;
        MaximumValueInWindow(ar,k);
    }
}
