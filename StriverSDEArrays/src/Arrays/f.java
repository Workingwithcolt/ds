package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class f {
    public static void main(String[] args){
        int[] arr = {1,4,-5,3};
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        int sum =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                p.offer(arr[i]);
            }
        }
        for(int i=0;i<2;i++){
            if(!p.isEmpty()) {
                sum += p.poll();
            }
        }
        System.out.println(sum);
    }
}
