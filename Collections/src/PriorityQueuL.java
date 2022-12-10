import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuL {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(4);
        pq.offer(5);
        pq.offer(6);
        pq.offer(7);
        pq.offer(8);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }

}
