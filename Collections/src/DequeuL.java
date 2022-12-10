import java.util.ArrayDeque;

public class DequeuL {
    public static void main(String[] args) {
        ArrayDeque<Integer> Adq = new ArrayDeque<>();
        Adq.offer(23);
        Adq.offerFirst(12);
        Adq.offerLast(45);
        System.out.println(Adq);

    }
}
