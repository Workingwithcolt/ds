import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> Pq =new PriorityQueue<>();//here in the default manner the min heap is implemented
        Pq.offer(3);
        Pq.offer(1);
        Pq.offer(5);
        Pq.offer(0);
        System.out.println(Pq);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//it is the max heap
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(5);
    }
}
