import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueL {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("chetan");//it does not throw an exception like add method
        queue.offer("manish");
        queue.offer("sakshi");
        String n = queue.poll();//it does not throw an exception like element method
        queue.peek();//that will tell which element is at the top
        System.out.println(n);
    }
}
