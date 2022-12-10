import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;

public class ArrayDequeuL {
    static ArrayDeque<Integer> ad = new ArrayDeque<>();
    public static void main(String[] args) {
        ad.offer(1);
        ad.offerLast(3);
        ad.offerFirst(34);
        System.out.println(ad);
    }
}
