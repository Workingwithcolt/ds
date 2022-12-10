package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianOfStreamRunningInteger {
    public static int[] MedianOfStream(int[] arr){
        int temp = arr[0];
        int j =0;//5 4 3 2 1
        int counter = 1;
        System.out.println(arr[0]);
        for(int i=1;i<arr.length;i++){
            j = i;
            temp = arr[i];
            while(j>0 && arr[j-1]> temp){
                    arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
            counter++;
            if(counter % 2 == 0){
                int firstmedian = counter/2;
                int median = (arr[firstmedian]+arr[firstmedian-1])/2;
                System.out.println(median);
            }else if(counter%2 !=  0){
                int firstmedians = counter/2;
                System.out.println(arr[firstmedians]);
            }
        }
        return arr;
    }
    public static void Optimise(int[] arr){
        PriorityQueue<Integer> q2 = new PriorityQueue<>();// increasing order
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++){
            if(q1.isEmpty() || q1.peek() > arr[i]){
                q1.add(arr[i]);
            }else{
                q2.add(arr[i]);
            }
            if(q1.size() > q2.size()+1){
                q2.add(q1.peek());
                q1.poll();
            }else if(q2.size() > q1.size()+1){
                q1.add(q2.peek());
                q1.poll();
            }
            if((q1.size()+q2.size()) % 2 == 0){
                System.out.println((q1.peek()+q2.peek())/2);
            }else{
                if(q1.size()>q2.size()){
                    System.out.println(q1.peek());
                }else{
                    System.out.println(q2.peek());
                }
            }
        }

    }
    public static void main(String[] args) {
      int[] arr = {5,15,1,3};
        Optimise(arr);
//        for (int e:arr) {
//            System.out.println(e);
//        }

    }
}
